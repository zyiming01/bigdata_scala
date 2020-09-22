package com.anchor.actor


//import scala.actors.Actor
//import scala.collection.mutable
//import scala.concurrent.Future
//import scala.io.Source
//import scala.reflect.io.File

import java.io.File
import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.io.Source

/**
  * create by zyiming.
  */

case class SubmitTask(fileName: String)
case class ResultTask(result: Map[String,Int])
class Task extends Actor{
  override def act(): Unit = {
    loop {
      react {
        case SubmitTask(fileName) => {
          val contents = Source.fromFile(new File(fileName)).mkString
          var arr = contents.split("\r\n")
          val result = arr.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.length)

          // 把本次task的结果返回给发送消息的地方
          sender ! ResultTask(result)
        }
      }
    }
  }
}


object WordCount {
  def main(args: Array[String]): Unit = {
    // 创建待处理文件数组
    val files = Array("C:\\Users\\64955\\Desktop\\aaa.txt","C:\\Users\\64955\\Desktop\\bbb.txt")

    val replaySet = new mutable.HashSet[Future[Any]]
    //
    val resultList = new mutable.ListBuffer[ResultTask]
    // 遍历待处理文件 分别启动task处理
    for (f <- files) {
      val t = new Task
      // 启动actor 并发送待处理文件名称 异步有返回值的
      val replay = t.start() !! SubmitTask(f)
      // 把返回结果添加到replaySet中
      replaySet += replay
    }

    // 遍历replaySet 找出真正有返回结果的Future
    while (replaySet.size > 0) {
      // 通过isSet方法过滤出Future真正有结果的
      val toCumpute = replaySet.filter(_.isSet)
      // 遍历已经完成的toCumpute 提取数据 保存到resultList
      for (r <- toCumpute) {
        val result = r.apply()
        resultList += result.asInstanceOf[ResultTask]
        replaySet.remove(r)
      }
    }

    val finalResult = resultList.map(_.result).flatten.groupBy(_._1).mapValues(x => x.foldLeft(0)(_ + _._2))
    println(finalResult)
  }
}
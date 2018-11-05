package cn.itcast.actor

import scala.actors.Actor

/**
  * create by zyiming.
  */
//TODO 实现actor不间断接收消息 本质就是让receive死循环
class MyActor extends Actor{
  override def act(): Unit = {
    // receive用于每个actor内部进行消息的接收处理
    // 通常使用模式匹配的方式针对消息进行处理
    // 使用while实现循环获取消息
    while (true) {
      receive {
        case "start" => println("starting....")
        case "stop" => println("stop....")
      }
    }
  }
}

object MyActor {
  def main(args: Array[String]): Unit = {
    val actor = new MyActor
    actor.start()

    // 发送消息 异步无返回值的消息
    actor ! "start"
    actor ! "stop"
    println("消息发送完成")
  }
}

package com.anchor.actor

import scala.actors.Actor

/**
  * create by zyiming.
  * 使用react方法代替receive方法去接受消息
  * 好处：react方式会复用线程，避免频繁的线程创建、销毁和切换。比receive更高效
  * 注意:  react 如果要反复执行消息处理，react外层要用loop，不能用while
  */
class YourActor extends Actor{
  override def act(): Unit = {
    loop {
      react {
        case "start" => println("starting....")
        case "stop" => println("stop....")
      }
    }
  }
}


object YourActor {
  def main(args: Array[String]): Unit = {
    val actor = new YourActor
    actor.start()

    // 发送消息 异步无返回值的消息
    actor ! "start"
    actor ! "stop"
    println("消息发送完成")
  }
}
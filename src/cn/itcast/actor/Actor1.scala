package cn.itcast.actor

import scala.actors.Actor

/**
  * create by zyiming.
  */
object Actor1 extends Actor{
  println("构造函数执行了")
  override def act(): Unit = {
    for (i <- 0 to 10) {
      println("Actor1:"+i)
      Thread.sleep(2000)
    }
  }
}
object Actor2 extends Actor{
  println("构造函数执行了")
  override def act(): Unit = {
    for (i <- 0 to 10) {
      println("Actor2:"+i)
      Thread.sleep(2000)
    }
  }
}

object ActorTest extends App {
  //启动actor
  Actor1.start()
  Actor2.start()
}


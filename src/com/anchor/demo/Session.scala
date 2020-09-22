package com.anchor.demo

/**
  * create by zyiming.
  *
  * scala 提供了object，相当于 class 的单个实例。
  * 可以直接访问，不需要实例化该类的对象。
  * 因此main方法可以写在object中，作为程序启动的入口。
  *
  * 在object中，属性、方法相当于都是静态的。
  *
  * object作用：存放工具方法和常量、高效共享单个不可变的实例、单例模式等。
  */


class Session {}


object SessionFactory {
  // 该部分相当于Java中的静态块
  val session = new Session
  // 在object中的方法相当于Java中的静态方法
  def getsession(): Session = {
    session
  }
}

object SingletonDemo {
  def main(args: Array[String]): Unit = {
    // 单例对象,不需要new,用[单例对象名称.方法]调用对象中的方法
    val session1 = SessionFactory.getsession()
    println(session1)
    // 单例对象,不需要new,用[单例对象名称.变量]调用对象中成员变量
    val session2=SessionFactory.session
    println(session2)
  }
}

package com.anchor.extend


class Person1 {
  var name : String = ""
  var age : Int = 0
  val score : String = ""
  // 非抽象方法
  def sayHello = println("hello")
}

class Student1 extends Person1 {

  override def sayHello: Unit = println("hello_son")
//  override var name : String = ""
//  override var score : String = ""

  val hobby = "ball"
}

object Student1 {
  def main(args: Array[String]): Unit = {
//    val s1 = new student1
//    s1.sayHello
    val s1: Person1 = new Student1
    val s2: Person1 = null
    println(s1.isInstanceOf[Student1])
    //如果对象引用的为null,name类型判断一定返回false
    println(s2.isInstanceOf[Student1])

  }
}

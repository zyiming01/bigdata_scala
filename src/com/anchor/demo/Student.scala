package com.anchor.demo

/**
  * create by zyiming.
  * 每个类都有主构造器,主构造器的参数直接放置类名后面,与类交织在一起
  */
class Student(val name: String, var age: Int) {
  //主构造器会执行类定义的所有语句
  println("执行主构造器")
  private var gender = "male"

  def this(name: String,age: Int,gender: String) {
    //每个辅助构造器执行必须以主构造器或者其他辅助构造器的调用开始
    this(name,age)
    println("执行辅助构造器")
    this.gender=gender
  }
}

object Student {
  def main(args: Array[String]): Unit = {
    val s1 = new Student("zhangsan",20)
    println(s1.gender)
    val s2 = new Student("zhangsan",20,"female")
    println(s2.gender)
  }
}
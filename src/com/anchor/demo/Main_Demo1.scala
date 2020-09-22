package com.anchor.demo

/**
  * create by zyiming.
  */
// 1.在中定定义main方法
object Main_Demo1 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      println("hello, "+args(0))
    } else {
      println("hello world!")
    }
  }
}

// 2.使用继承App Trait,将需要写在main方法中运行的代码
// 直接作为 object 的 constructor 代码即可.
// 而且还可以使用args接收传入的参数
object Main_Demo2 extends App {
  if (args.length > 0) {
    println("hello, "+args(0))
  } else {
    println("hello world!")
  }
}
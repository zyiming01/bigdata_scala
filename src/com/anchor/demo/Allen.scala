package com.anchor.demo

/**
  * create by zyiming.
  */
class Allen(val name : String) {

}

object Allen {

  //TODO apply方法的定义在类的伴生对象中
  //TODO apply方法在某种程度上相当于构造器
  def apply(name: String): Allen = new Allen(name)


  def main(args: Array[String]): Unit = {
    val allen = new Allen("12")

    //当遇到 类名(参数一,参数二)
    val allen1 = Allen("13")
  }
}

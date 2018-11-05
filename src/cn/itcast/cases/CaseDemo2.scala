package cn.itcast.cases

import scala.util.Random

/**
  * create by zyiming.
  */
object CaseDemo2 extends App {
  val arr = Array("hello",1,2.0,CaseDemo1)
  val v = arr(Random.nextInt(arr.length))
  v match {
    case x: Int => println("Int "+x)
    case y: Double if(y >= 0) => println("Double "+y)
    case z: String => println("string "+z)
    case _ => throw new Exception("not match exception")
  }

}

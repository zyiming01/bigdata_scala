package cn.itcast.cases

import scala.util.Random

/**
  * create by zyiming.
  */
object CaseDemo1 extends App {
  val arr = Array("hadoop","zookeeper","spark")
  val name = arr(Random.nextInt(arr.length))
  name match {
    case "hadoop" =>  println("大数据分布式存储和计算框架...")
    case "zookeeper" =>  println("大数据分布式协调服务框架...")
    case "spark" =>  println("大数据分布式内存计算框架...")
    case _ => println("I don`t kown you")
  }

}

package com.anchor.cases

import scala.util.Random

/**
  * 样例类
  * create by zyiming.
  * case class 类型，是多例的，后面要跟构造参数。
  * case object 类型，是单例的。
  */
//todo 用case修饰的class object叫做样例类 专门用于模式匹配
case class SubmitTask(id: String,name: String)
case class HearBeat(time: Long)
case object CheckTimeOutTask


object CaseDemo4 extends App {
  val arr = Array(CheckTimeOutTask,HearBeat(123123),SubmitTask("001","task-001"))
  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }

    case HearBeat(time) => {
      println(time)
    }

    case CheckTimeOutTask => {
      println("check")
    }
  }




}

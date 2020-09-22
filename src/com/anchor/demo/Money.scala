package com.anchor.demo

/**
  * create by zyiming.
  */
class Money(val value: Double,val country: String) {}

object Money {
  def apply(value: Double, country: String) : Money = new Money(value,country)

  def unapply(arg: Money): Option[(Double, String)] = {
    if (arg == null) {
      None
    } else {
      Some(arg.value, arg.country)
    }
  }


}



//def testUnapply() = {
//  val money = Money(10.1,"RMB")
//  money match {
//  case money(num,"RMB") => println("RMB: "+num)
//  case _ => println("Not RMB")
//}
//}
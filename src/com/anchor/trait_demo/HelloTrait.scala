package com.anchor.trait_demo

/**
  * create by zyiming.
  */
trait HelloTrait {
    def sayHello : Unit
}

trait ByeTrait {
  def sayBye : Unit
}

//TODO 实现trait使用extends关键字
class Allen1(val name: String) extends HelloTrait with ByeTrait  {
  override def sayHello: Unit = println("hello "+name)

  override def sayBye: Unit = println("bye " + name)
}

object Allen1 {
  def main(args: Array[String]): Unit = {
    val allen = new Allen1("dabao")
    allen.sayHello
  }
}

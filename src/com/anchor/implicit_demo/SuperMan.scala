package com.anchor.implicit_demo

/**
  * create by zyiming.
  */
class Man(val name: String)
class SuperMan(val name: String) {
  def heat=println("超人打怪兽")
}

object SuperMan {
  //隐式转换方法
  implicit def man2SuperMan(man: Man)=new SuperMan(man.name)

  def main(args: Array[String]): Unit = {
    val hero=new Man("hero")
    //man具备了Superman的方法
    hero.heat
  }
}

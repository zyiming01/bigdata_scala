package cn.itcast.demo

/**
  * create by zyiming.
  */
//伴生类
class Dog {
  val id = 1
  private var name = "itcast"
  def printName(): Unit = {
    // 在Dog类中可以访问伴生对象Dog的私有属性
    println(Dog.CONSTANT+name)
  }
}

//伴生对象
object Dog {
  //伴生对象的私有属性
  private val CONSTANT = "汪汪汪 : "

  def main(args: Array[String]): Unit = {
    val d = new Dog
    //访问私有的字段name
    d.name="123"
    d.printName()
  }
}
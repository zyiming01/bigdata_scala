package cn.itcast.demo

/**
  * create by: zyiming.
  * description: 在Scala中,类并不用声明为public类型
  * Scala源文件中可以包含多个类,所有这些类都具有共有可见性
  * create time: 20:41 2018/9/7
  */
class Person {
  //用val修饰的变量的可读性,有getter 但没有setter(相当于Java中用final修饰的变量)
  val id="9722"

  //用var修饰的变量既有getter, 又有setter
  var age: Int = 18

  //类私有字段,只能在类的内部使用或者伴生对象中访问
  private var name : String = "唐伯虎"

  //类私有字段,访问权限更加严格,该字段在当前类中被访问
  //在伴生对象里面也不可以访问
  private[this] var pet = "小强"
}

object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person

//    p.id="123"
    println(p.id)
    // 打印age
    println(p.age)
    // 伴生对象中可以访问private变量
    println(p.name)
    //由于pet字段用private[this]修饰,伴生对象中访问不到pet变量
//    p.pet 访问不到
  }
}
package cn.itcast.cases

/**
  * create by zyiming.
  */
object PartialFuncDemo {
  val func1: PartialFunction[String,Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

//  isDefinedAt ： 这个函数的作用是判断传入的参数是否在这个偏函数处理的范围内
  println(func1.isDefinedAt("one"))
  println(func1.isDefinedAt(""))

  // 用普通方法加上模式匹配也尅实现上述功能
  def func2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case  _ => -1
  }

  //TODO 偏应用函数 部分应用函数 当应用的参数有n个 但是调用的时候给予小于n个参数
  //TODO 因为这时候函数并没有真正执行完 所以返回的结果还是一个函数
  val f3 = (x:Int , y: Int) => x+y
  println(f3(1,8))
  val f: (Int) => Int = f3(1,_:Int)
  println(f)
  val r2: Int = f(4)
  println(r2)

  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println(func2("one"))
  }
}

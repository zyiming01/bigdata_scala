package cn.itcast.demo

/**
  * create by zyiming.
  */
class Foo(foo: String) {
}

object Foo {
  def apply(foo: String) : Foo = {
    new Foo(foo)
  }
}

//定义了以一个Foo类,并且在这个类中,有一个伴生对象Foo,里面定义了apply方法.有了这个apply方法以后,
//我们调用这个Foo类的时候,用函数的方式来调用

object Client {
  def main(args: Array[String]): Unit = {
    val foo = Foo("hello")
  }
}

//我们调用Foo("hello")的方式,就得到一个Foo类型的对象,这一切就是apply方法的功劳
//如果没有apply方法,我们将使用new关键字来得到Foo对象
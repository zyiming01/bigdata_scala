package cn.itcast.trait_demo

/**
  * create by zyiming.
  *
  */
trait Logger {
  def log(message: String): Unit = println(message)
}

class PersonForLog(val name: String) extends Logger {

}

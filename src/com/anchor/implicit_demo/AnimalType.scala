package com.anchor.implicit_demo

/**
  * 隐式转换调用类中本不存在的方法
  * create by zyiming.
  */

class SwimingType{
  def wantLearn(sw: String)  = println("小狗学会了: " + sw)
}

//定义隐式转换方法 注意,必须定义在object中
object swimming {
  implicit def learningType(s: AnimalType) = new SwimingType
}

//定义个普通的类 不具备任何方法
class AnimalType

object AnimalType {

  def main(args: Array[String]): Unit = {
    // import 导入隐式转换方法
    import com.anchor.implicit_demo.swimming._

    val dog = new AnimalType //小狗不具备学习能力
    dog.wantLearn("狗刨")
  }
}
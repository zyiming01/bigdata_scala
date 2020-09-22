package com.anchor.implicit_demo

import java.io.File

import scala.io.Source

/**
  * create by zyiming.
  */
class RichFile(val file:File){
  def read = Source.fromFile(file.getPath()).mkString
}

object Context{
  implicit def file2RichFile(f:File)= new RichFile(f)
}

object ImplictDemo {

  def main(args: Array[String]) {
    import Context.file2RichFile
    println(new File("C:\\Users\\64955\\Desktop\\aaa.txt").read)
  }

}
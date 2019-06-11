package lectures.part1

object Calls extends App{

  def callByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def calledByName(x:  => Long): Unit = { //runs function UNTIL its used
    println("By name: " + x)
    println("By name: " + x)
  }

  callByValue(System.nanoTime())
  calledByName(System.nanoTime())

}

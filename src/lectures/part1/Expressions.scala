package lectures.part1

object Expressions extends App{

  var x = 1 + 2
  println(x)

  val condition = true

  val result = if(condition) 23 else 5

  print(result)

  val weirdValue = (x = 3)
  print(weirdValue)

  //codeblocks type is String
  val codeBlock = {
    val y  = 3
    val z = y+2

    if(z > 2) "Hello" else "goodbye"
  }
}

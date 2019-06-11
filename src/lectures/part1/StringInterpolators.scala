package lectures.part1

object StringInterpolators extends App{


//  S interpolation
  val name = "Marco"
  val random = 64

  val greeting = s"sup dude $name this is a random number $random"

  println(greeting)

//  F interpolation
  val speed = 12.2
  val predicate = f"this is a speed $speed%2.2f predicate"
  println(predicate)

//  RAW interpolation
  println(raw"this is a raw message \n \b \t disregard")

}

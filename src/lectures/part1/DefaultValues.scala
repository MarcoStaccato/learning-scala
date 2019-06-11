package lectures.part1

object DefaultValues extends App{

  def factorial(number : Int, accumulator: BigInt = 1): BigInt = {
    if(number<=1) accumulator
    else factorial(number - 1, number * accumulator) //TAIL RECURSION - use recursive call as the LAST expression
  }

  val fact8 =factorial(8)

  println(fact8)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")

//  savePicture(1200, 800) //not compiling
//  savePicture(800) //not compiling

  savePicture(width = 800)
  savePicture("bmp", height = 4096, width = 4096)

}

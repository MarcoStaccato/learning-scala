package lectures.part1

import scala.math.sqrt

object Functions extends App{

  //auto definition for a result type
  def someFunction(a :String, b :Int) = {
    a + " " + b
  }

  println(someFunction("Hello", 42))

  def parameterlessFunction(): Int = 42

  println(parameterlessFunction())
  println(parameterlessFunction)


  //recursion needs return type
  def repeatingFunction(string : String, n : Int): String = {
    if(n==1) string
    else string + " " + repeatingFunction(string, n-1)
  }

  println(repeatingFunction("Hello", 14))

  def sideEffectFun(string: String) :Unit = println(string)

  def metaFunction(n: Int): Int = {
    def innerFunction(a: Int, b: Int) = a+b

    innerFunction(2,3)
  }

  def factorial(number : Int): Int = {
    if(number == 1) 1
    else number * factorial(number-1)
  }

  println(factorial(5))

  def fibonacci(number : Int): Int = {
    if(number <= 1) number
    else fibonacci(number-1) + fibonacci(number-2)
  }

  println(fibonacci(12))


  def isprime(number : Int): Boolean = {

    def untilT(t: Int): Boolean = {
      if( t <=1 ) true
      else number%t != 0 && untilT(t-1)
    }

    untilT(sqrt(number).toInt)
  }

  println(isprime(37))

  println(isprime(2003))

  println(isprime(39*27))

}

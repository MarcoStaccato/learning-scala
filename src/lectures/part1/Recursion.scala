package lectures.part1

import scala.annotation.tailrec
import scala.math.sqrt

object Recursion extends App{

  def factorial(number : Int): Int = {
    if(number == 1) 1
    else {
      println("computing factorial: " + number + " first need of: " + (number-1))
      val result = number * factorial(number-1)
      println("computed: " + number)
      result
    }
  }

  println(factorial(10))
  println(factorial(3))
//  println(factorial(5000)) //stackoverflowerror


  def betterFactorial(number : Int): BigInt = {

    def helper(number : Int, accumulator: BigInt): BigInt = {
      if(number<=1) accumulator
      else helper(number - 1, number * accumulator) //TAIL RECURSION - use recursive call as the LAST expression
    }

    helper(number,1)
  }

  println("computing tail recursion: ")
  println(betterFactorial(10))
//  println(betterFactorial(5000))


  def tailRepetition(string: String, number: Int): String ={
    @tailrec
    def helper(string: String, number: Int, result: String): String = {
      if(number <=1) result
      else helper(string, number-1, result + " " + string)
    }

    helper(string, number, string)
  }

  println(tailRepetition("Hello", 14))


  def tailPrime(number: Int): Boolean = {
    @tailrec
    def isPrime(current: Int, continue: Boolean): Boolean = {
      if(!continue) false
      else if(current <=1 ) true
      else isPrime(current-1, number%current != 0 && continue)
    }

    isPrime(sqrt(number).toInt, true)
  }

  println(tailPrime(37))

  println(tailPrime(2003))

  println(tailPrime(39*27))


  def tailFibonacci(number: Int): Int = {

    def fibonacci(num: Int, last: Int, lastLast: Int) : Int = {
      if(num <= 1) last
      else fibonacci(num+1, last + lastLast, last)
    }

    if(number <=2) 1
    else fibonacci(2, 1, 1)
  }

  println(tailFibonacci(12))
}
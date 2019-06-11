package lectures.part2

import java.time.Year

object OOBasics extends App {

  val person = new Person("John", 90)

  println(person.age)
  println(person.x)
  person.greet("dude")
  person.greet()

  val counter = new Counter
  println(counter.current)
  println(counter.increment.current)
  println(counter.increment(14).current)


}

//constructor
class Person(name: String, val age: Int = 0) {
  //  class parameters are not fields person.name wont compile
  val x = 2

  println(1+2)

  def greet(name: String): Unit = println(s"${this.name} says Hi $name")

  def greet(): Unit = println(s"Sup $name")

//  Overloading cosntructor

  def this(name: String) = this(name, 0) //constructors can only call themselves
  def this() = this("John Doe")
}


class Writer(firstName: String, surname: String, year: Int){

  def fullName: String = firstName + surname

  def age: Int = Year.now().getValue - year
}

class Novel(name: String, release: Int, author: Writer) {

  def authorAge: Int = author.age

  def isWrittenBy: Writer = author

  def copy: Novel = new Novel(name, release, author)
}

class Counter(count: Int = 0) {

  def current: Int = count

  def increment: Counter = {
    println("incrementing")
    new Counter(count + 1)
  }

  def decrement: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

//  def increment(value: Int): Counter = new Counter(count + value)
//
//  def decrement(value: Int): Counter = new Counter(count - value)

  def increment(n: Int): Counter = {
    if(n<=0) this
    else increment.increment(n-1)
  }

  def decrement(n: Int): Counter = {
    if(n<=0) this
    else decrement.decrement(n-1)
  }
}


package lectures.part2

abstract class MyListGeneric[+A] {

  def head: A
  def tail: MyListGeneric[A]
  def isEmpty: Boolean
  def add[B>: A](element: B): MyListGeneric[B]

//  polymorphic call
  def printElements: String

  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyListGeneric[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyListGeneric[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyListGeneric[B] = new Cons(element, Empty)

  override def printElements: String = ""
}

class Cons[+A](h: A, t: MyListGeneric[A]) extends MyListGeneric[A] {
  def head: A = h
  def tail: MyListGeneric[A] = t
  def isEmpty: Boolean = false
  def add[B>: A](element: B): MyListGeneric[B] = new Cons(element, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else h + ", " + t.printElements

}



object ListGenericTest extends App {
  val listofIntegers: MyListGeneric[Int] = new Cons(1 , new Cons(2 , new Cons(3 , new Cons(4, Empty))))

  println(listofIntegers.printElements)

  val listOfStrings: MyListGeneric[String] = new Cons("b", new Cons("a", Empty))

  println(listOfStrings.printElements)
}



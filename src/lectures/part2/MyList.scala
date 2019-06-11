package lectures.part2

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(int: Int): MyList

//  polymorphic call
  def printElements: String

  override def toString: String = "[" + printElements + "]"
}

object EmptyTest extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(int: Int): MyList = new ConsTest(int, EmptyTest)

  override def printElements: String = ""
}

class ConsTest(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(int: Int): MyList = new ConsTest(int, this)

  def printElements: String =
    if(t.isEmpty) "" + h
    else h + ", " + t.printElements

}



object ListTest extends App {
  val list = new ConsTest(12, new ConsTest(1, EmptyTest))
  println(list.tail.head)
  println(list.add(5).head)
  println(list.isEmpty)

  print(list.toString)
}



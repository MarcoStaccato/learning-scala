package lectures.part2

object Generics extends App {

//  Generic type
  class MyList[+A] {

//  def add[B >: A](element: A): MyList[B] = ???
  }

  class MyMap[Key, Value]

  val listInteger = new MyList[Int]

  val listString = new MyList[String]


  object MyList {
//    def Empty[A]: MyList[A] = ???

  }

  class Animal

  class Cat extends Animal
  class Dog extends Animal

//  Variance problem
  var animal: Animal = new Cat

//  List[Cat] extends List[Animal]
  class CovariantList[+A]
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
//  animalList.add(new Dog) ? WTF we return a list of animals

//  List[Type] should only accept Type
  class InvariantList[A] //can not substitune one for another
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

//  Opposite to covariance
  class ContravariantList[-A]
  var contravariantList: ContravariantList[Dog] = new ContravariantList[Animal]
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


//  Bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)



}

package lectures.part2

object AbstractdataTypes extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "canine"
    def eat: Unit = println("crunch crunch")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "reptile"
    def eat: Unit = println("nom nom")
    def eat(animal: Animal): Unit = println(s"I'm a croc eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)


//  traits vs abstract classes
//  1 - traits do not have constructor parameters
//  2 - multiple traits might be inherited by the same class
//  3 - traits - behaviour
}

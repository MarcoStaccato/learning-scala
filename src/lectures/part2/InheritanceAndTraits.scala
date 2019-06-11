package lectures.part2

object InheritanceAndTraits extends App{

//  single class inheritance
  sealed class Animal {

//  private, protected
    def eat = println("nomnom")

    val creatureType = "wild"

  }

  class Cat extends Animal

  new Cat().eat


  class Person(name: String, age: Int)
//  class Adult(name:String, age: Int, IdCard: String) extends Person  //wont compile
  class Adult(name:String, age: Int, IdCard: String) extends Person(name, age)

//  class Dog extends Animal {
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat
      println("crunch, crunch")
    }

//    override val creatureType: String = "domestic"
  }

  new Dog("asd").eat
  println(new Dog("asd").creatureType)


//  preventing overrides
//
//  1. use final on member
//  2. use final on the entire class
//  3. seal the class  can only extend on current file
//


}

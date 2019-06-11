package lectures.part2

object Objects  extends App{

  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

    def apply(mother:Person, father:Person): Person = new Person("NewPerson")
  }

  class Person(val name: String) {
//    instance level functionality

  }

//  Scala object -> SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")


  println(mary == john)

  val person1 = Person
  val person2 = Person

  println(person1 == person2)

//  val bob = Person.from(mary, john)

  val bob = Person(mary, john)

}

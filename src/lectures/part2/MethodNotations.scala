package lectures.part2

object MethodNotations extends App{


  class Person(val name: String, favoriteMovie: String, val age: Int = 30) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String =  s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String =  s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"sup dude!"

    def isAlive : Boolean = true

    def apply() : String = s"Hi, my name is ${name}, and my favorite movie is ${favoriteMovie}"

//    exercises
    def +(string: String): Person =  new Person(s"${name} (${string})", favoriteMovie)

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def learns(string: String) : String = s"${name} learns ${string}"

    def learnScala : String = learns("Scala")

    def apply(times: Int) : String = s"${name} watched ${favoriteMovie} ${times} times"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))

//  infix notation
  println(mary likes "Inception") //only works when method receives ONE argument

  val tom = new Person("Tom",  "Fight club")

  println(mary hangOutWith tom)

  println(mary + tom)

  println(mary.+(tom))

  println(1.+(2))


//  prefix notation

  val x = -1
  val y = 1.unary_-
//  unary_ only works with - + ~ !
  println(!mary)
  println(mary.unary_!)


//  postfix notation

  println(mary.isAlive)

  println(mary isAlive)


//  APPLY

  println(mary.apply())

  println(mary())


//  ----exercises

  var secondMary = mary + "the rockstar"
  println(secondMary())
  println((mary + "The rockstar").apply())
  secondMary = +mary
  println(+mary.age)
  println(secondMary.age)


  println(mary learns "stuff")

  println(mary learnScala)

  println(mary.apply(20))

  println(mary(40))



}

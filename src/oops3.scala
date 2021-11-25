

object oops3 extends App{
  
  //The whole purpose of creating abstract class is to implements it later by inherting it in child class.
  //Instantiation of abstract class is not possible.
  
  abstract class Animal{
    def sleep:Unit=println("Animal sleep a lot")
    var creatureType:String
    def eat
  }
  
  class Dog extends Animal{
    var creatureType:String ="canine"
    def eat:Unit=println("I eat flesh")
  }
  
  val d = new Dog
  println(d.creatureType+" "+d.eat+" "+d.sleep)
 
  
  trait Carnivores
  {
  def prefferedMeal
  }
  
  trait ColdBlooded
  
  class Crocodile extends Animal with Carnivores with ColdBlooded
  {
  var creatureType: String="canine"
  def eat:Unit =println("I eat flesh")
  def prefferedMeal:Unit = println("I like sea food")
  }
  
  val c = new Crocodile                           //> c  : oops4.Crocodile = oops4$Crocodile$1@6b2fad11
  c.eat                                           //> I eat flesh
  c.prefferedMeal  
  
  
}
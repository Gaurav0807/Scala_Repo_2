

object Traits extends App {
  
  //Multiple inheritance can be achieve by using traits
  
  trait Geeks1{
     def method1()
  }
  
  trait Geeks2{
    def method2()
  }
  
  class GFG extends Geeks1 with Geeks2{
    
    def method1()
    {
      println("Trait 1")
    }
    
    def method2()
    {
      println("Trait 2")
    }
    
    var a= new GFG
    println(a.method1())
    println(a.method2())
    
    
  }
  
}


object oops7 extends App{
  
  //yield :- with the help of yield we can get a new list from a loop.
  val a=for(i<- 1 to 10) yield{
    i*i
  }
  
  println(a)
  
  
  //Ifguard :- filtering in for loop
  
  val b = for(i<- 1 to 10; i>5) yield{
    i*i
  }
  println(b)
  
  
}
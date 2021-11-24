

object Practise_2 extends App{
  
  def Square(x:Int):Int={
    x*x
  }
  
  def transformIn(x:Int,F:Int=>Int):Int={
    F(x)
  }
  
  //For Loop
  for(x <- 1 to 5)
  {
    println(x)
  }
  
  println("While Loop")
  //While loop 
  var i:Int=0;
  while(i<=5)
  {
    println(i)
    i=i+1
  }
  
 println({val x:Int=20;x+20})
 
 //Function 
  println(transformIn(4,Square))
}
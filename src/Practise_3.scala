

object Practise_3 {
  
  
  def Factorial(x:Int):Int={
    var result:Int=1;
    for(i<- 1 to x)
    {
      result=result*i
    }
    result
  }
  
  def areaofcircle={
    val pi=3.14;
    (x:Int)=>pi*x*x
  }
  
  
  def genericSum(f:Int=>Int)(x:Int,y:Int)={
    f(x)+f(y)
  }
  
  
  def main(args:Array[String])={
    
    println(Factorial(5))
    
    var a=areaofcircle;
    println(a(10))
    
    
    println(genericSum(x=>x*x)(5,3))
   
    
  }
}
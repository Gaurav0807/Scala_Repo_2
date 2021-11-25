

object oops6 extends App{
  
  //Null,Nill ,None ,Nothing Option ,Unit
  
  //Null
  def tryIt(thing:Null):Unit={
    println("That worked")
  }
  
  tryIt(null) //That worked
  
//  we should restrict the use of null as its not preffered because it can lead to null pointer exceptions . 
  
   // Nil-is empty list
  var a=Nil
  println(a)
  
  //Nothing is trait in scala .There are no instance of nothing . Nothing means that there was an error or exception and nothing 
  //was returned.
  
  //Option
  
  def getNum(num:Int):Option[String]={
    if(num>=0)
      Some("A Positive Number")
    else None
  }
  
  def printResult(num:Int)={
    getNum(num) match{
      case Some(str)=> println(str)
      case None => println("No String...")
    }
  }
  
  println(printResult(5))
}
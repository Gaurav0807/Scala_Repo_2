

object oops5 extends App{
  
  case class person(name:String,age:Int)
  
  var p1= new person("Gaurav",30)
  var p2= new person("gaurav",30)
  println(p1.name)
  
  println(p1==p2)
  
  //p1.age=66 reassignment is not possible
  
  //equals and hashcode method implemented already
  println(p1==p2) //false because it check data not references
  
  
  //case class have already have a copy method
  
  var p3 = p1.copy()
  println(p3)
   
  
  
}
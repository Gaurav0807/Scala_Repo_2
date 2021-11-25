

object oops1 extends App {
  
  class person(val name:String,val age:Int)
  
   val p=new person("Gaurav",21)
  println(p.name +" "+p.age)
  
  class person1(name:String,age:Int)
  {
    val x=20
    def ageDoubler = age*2
    def salaryDoubler(salary:Int)=salary*2
  }
  
  var p1 = new person1("Gaurav",21)
  println(p1.ageDoubler+" "+p1.salaryDoubler(6))
  
}
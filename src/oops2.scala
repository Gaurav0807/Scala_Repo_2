

object oops2 extends App {
   object Person { //Class Level Functionality
     val N_Eyes=2
     def canFly:Boolean=false
   }
   
   class Person(val name:String,val age:Int)  //Instance Level Functionality
   {
     def salaryDoubler(salary:Int)=salary*2
   }
   
   var p1 = new Person("Gaurav Rawat",21)
   var p2 = new Person("Hardik Tyagi",22)
   
   println(p1==p2)
   
   println("Combined Result:-"+p1.name+" "+p1.age+" "+Person.N_Eyes+" "+Person.canFly+" "+p1.salaryDoubler(66))
   
   //When class level Functionality and instance level functionality both use Then this design pattern is call a companion .
   
}
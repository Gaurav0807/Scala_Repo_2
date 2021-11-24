

object Scala_Collection {
  def main(args:Array[String])={
    //Array can be referenced by index and it is 0 based.
    val a=Array(1,2,3,4,5)
    println(a.mkString(",")) //1,2,3,4,5
    for(i<-a)
      println(i)
     println("Value at 1st place "+a(0)) // 1
     println("Value at 2nd place "+a(1)) // 2
     
     
     //List
     
     val b=List(1,2,3,4,5)
     println(b.head) // 1
     println(b.tail) // 5
     println(b.reverse) // 5,4,3,2,1
     println(b.sum) //15
     
     //Tuple -> used for sql,can hold different datatypes
     //It is very commonly used in spark and it is 1 based index.
     val x=("Sumit",1000,true)
     println(x._1,x._2) //(Sumit,1000)
     println(x._1) //Sumit
     
     //Set :- holds only unique values.It cannot hold duplicated 
     val y=Set(1,2,1,2,3,1,2);
    println(y)
     println(y.min) //1
     println(y.max) //3 
     println(y.sum) //6 
     
     //Map -> collections of key value pair
     
     val xy=Map(1->"Gaurav",2->"Rawat")
    println(xy.get(2))
  }
}


object Practise_1 {
  def main(args:Array[String])={
    
    val a:Int=5;
    val b:String="Gaurav Rawat"
    val c:Boolean =true
    val d:Char='a'
    val e:Double=3.1415
    val f:Float=3.1415f
    val g:Long=12345678
    val h:Byte=127
    println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    
    //s interpolation
    println(s"Hello $b how are you");
    
    //f interpolation
    println(f"value of pi is $f%.2f");
    
    //raw interolation
    println(raw"hyy \n new");
    
    //String Comparision
     val letter1 :String="Gaurav"
     val letter2 :String="gaurav"
     
     if(letter1==letter2)
     {
       println("Letter1 and letter2 are same")
     }
     else
     {
       println("Not Same")
     }
    
     println("Please enter the value")
     //Switch case
     val num=readInt();
     num match{
       case 1 => println("one");
       case 2 => println("two");
       case 3 => println("three");
       case _ => println("Something Else")
     }
  }
}





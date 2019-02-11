import scala.io.StdIn._


object Cocientes {
  def main(args: Array[String]): Unit = {
    println("Ingrese el primer numero (numero mayor)")
    var  num1 = readInt()
    println("Ingrese el segundo numero (numero menor)")
    var  num2 = readInt()
    
    println("Los divisores del numero "+ num1+" Son: ")
     divisores(num1,num2)
    
    
  }//main
   def divisores(num1:Int, num2:Int):Unit={
  //var div = new ListBuffer[Int]()//list
    if(num2<=num1){
      if(num1%num2==0 ){
     println(num2)
     divisores(num1,num2+1)
    }else{
      divisores(num1,num2+1)
    }
    }
  }
  
}//object
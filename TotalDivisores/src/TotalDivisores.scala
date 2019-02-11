import scala.io.StdIn._

object TotalDivisores {
  
def main(args: Array[String]): Unit = {
    println("Ingrese el primer numero (numero mayor)")
    var  num1 = readInt()
    println("Ingrese el segundo numero (numero menor)")
    var  num2 = readInt()
     var cont=1
    println("el total de divisores del numero "+ num1+" es: " )
    divisores(num1,num2,cont)
    
    
  }//main
   def divisores(num1:Int, num2:Int,cont:Int):Unit={
  
    if(num2<=num1){
      if(num1%num2==0 ){
         
     divisores(num1,num2+1,cont+1)
    }else{
      divisores(num1,num2+1,cont)
    }
    }
    if(num2==num1){
      println(cont)
    }
    
  }
  
}//object
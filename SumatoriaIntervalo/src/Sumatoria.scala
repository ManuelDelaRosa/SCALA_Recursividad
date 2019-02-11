
import scala.io.StdIn._
object Sumatoria {
  def main(args: Array[String]): Unit = {
    println("Ingrese primer numero entero")
    var num1=readInt();
    println("Ingrese  segundo numero entero")
    var num2= readInt()
    
   
    
    println("Sumatoria de "+ num1 +" hasta "+ num2+" = "+sumaRecursiva(num1, num2))
  }//main
  

def sumaRecursiva(a: Int, b: Int): Int = {
    if (a >b) 0
    else {
        a + sumaRecursiva(a+1, b)
    }
}//suma recursiva


}//object
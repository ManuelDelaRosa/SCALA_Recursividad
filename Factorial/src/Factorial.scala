import scala.io.StdIn._

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Ingrese un numero")
    var num= readInt() 
    println("El factorial del numero "+num+ " es " +factorial(num))
  }//main
  
  def factorial(num:Int) : Int = {
    if(num == 0)
      1
    else
      factorial(num-1)*num
  }
}//object
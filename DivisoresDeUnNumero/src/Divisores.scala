import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Divisores {
  def main(args: Array[String]): Unit = {
     println("Ingrese un numero entero")
     var num= readInt()
     var div = 1
    
     println("Los divisores del numero "+ num+" Son: ")
     divisores(num,div)
     
  }//main
  
  def divisores(num:Int, div:Int):Unit={
  //var div = new ListBuffer[Int]()//list
    if(div<=num){
      if(num%div==0 ){
     println(div)
     divisores(num,div+1)
    }else{
      divisores(num,div+1)
    }
    }
  }
}//object
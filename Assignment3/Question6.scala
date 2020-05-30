package Assignment3

object Question6 extends App {

  def fibonacci(n:Int): Int = n match{

    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }

  def printFibonacci(n:Int)={

    var i=0: Int

    for(i <- 0 to n-1){

      printf("%d ",fibonacci(i));
    }
  }

  printFibonacci(6)
  println()
  printFibonacci(9)
  println()
  printFibonacci(20)
}

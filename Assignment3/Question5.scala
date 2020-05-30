package Assignment3

object Question5 extends App {

  def checkEven(n:Int):Boolean =  n%2 match{

    case 0 => true
    case _ => false

  }

  def sumEven(n:Int): Int = n match {

    case x if x<=0 => 0
    case x if (checkEven(x)) => x + sumEven(x-1)
    case x if (!checkEven(x)) => sumEven(x-1)
  }

  def sum(n:Int) = println(sumEven(n-1))


  sum(5)
  sum(0)
  sum(1)
  sum(10)

}

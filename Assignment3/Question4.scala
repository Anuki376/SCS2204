package Assignment3

object Question4 extends App {

  def checkEven(n:Int):Boolean =  n%2 match{

    case 0 => true
    case _ => false

  }

  println(checkEven(2))
  println(checkEven(7))
  println(checkEven(9))

}

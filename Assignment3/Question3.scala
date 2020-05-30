package Assignment3

object Question3 extends App {

  def sum(n:Int): Int = n match {

    case 0 => 0
    case _ => n + sum(n-1)
  }

  println(sum(5))
  println(sum(0))
  println(sum(1))
  println(sum(10))

}

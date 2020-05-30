package Assignment3

object Question1 extends App {

  def GCD(a:Int,b:Int): Int = b match{

    case x if x==0 => a
    case x if (x>a) => GCD(x,a)
    case _ => GCD(b,a%b)

  }

  def prime(num:Int, i:Int=2):Boolean = i match{

    case x if num<x => false
    case x if x==num => true
    case x if (GCD(num,x)>1) => false
    case x => prime(num,x+1)

  }

  println(prime(5))
  println(prime(8))
  println(prime(0))
  println(prime(1))
  println(prime(2))


}

package Assignment3

object Question2 extends App {

  def GCD(a:Int,b:Int): Int = b match{

    case 0 => a
    case x if (x>a) => GCD(x,a)
    case _ => GCD(b,a%b)

  }
  def prime(num:Int, i:Int=2):Boolean = i match{

    case x if num<x => false
    case x if x==num => true
    case x if (GCD(num,x)>1) => false
    case x => prime(num,x+1)

  }

  def primeSeq(n:Int)={

    var i=0: Int;

    if (n==1 || n==0){
      printf("No prime numbers less than %d\n", n)
    }

    else{
      for ( i<-2 to n){
        if(prime(i) && i!=n){
          printf("%d ", i)
        }
      }
    }

  }

  primeSeq(10)
  println()
  primeSeq(7)
  println()
  primeSeq(20)
  println()

}

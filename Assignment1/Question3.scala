package Assignment1

object Question3 {

  def TotalCost(n:Int): Unit ={

    var extra : Int = n-50;
    var total : Double = 24.95*0.6*n+50*3+extra*0.75;
    println(total);
  }

  def main(args: Array[String]): Unit = {
    TotalCost(60);

  }
}

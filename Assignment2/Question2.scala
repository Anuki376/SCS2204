package Assignment2

object Question2 {

  def attendees(tp:Int):Int=120+(15-tp)/5*20

  def revenue(tp:Int)=tp*attendees(tp)

  def cost(tp:Int)=500+3*attendees(tp)

  def profit(tp:Int)=revenue(tp)-cost(tp)

  def main(args: Array[String]): Unit = {

    print(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30))
    //Optimum ticket price = 25
  }

}

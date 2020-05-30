package Assignment2

object Question1 {

  def normalWage(h:Int):Int = h*150  //Function to calculate the normal wage of an employee

  def OT(h:Int):Int = h*75  //Function to calculate the OT wage of an employee

  def income(h1:Int,h2:Int) = normalWage(h1) + OT(h2)  //Function to calculate the total salary of an employee

  def tax(income:Int):Double = income*0.1  //Function to calculate the tax to be paid

  def takeHome(h1:Int,h2:Int):Double = income(h1,h2) - tax(income(h1,h2))  //Function to calculate the take home salary

  def main(args: Array[String]): Unit = {

    printf("%.2f", takeHome(40,20))

  }
}

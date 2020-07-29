package Assignment5

object Bank extends App {

  var Account1 = new Account( id = "976712534V", n = 1000, b = 15000 )
  var Account2 = new Account( id = "956512535V", n = 1001, b = -1000 )
  var Account3 = new Account( id = "966612536V", n = 1002, b = 33000 )
  var Account4 = new Account( id = "946412534V", n = 1003, b = -200 )

  var bank:List[Account] = List[Account](Account1,Account2,Account3,Account4)

  class Account(id:String, n:Int, b:Double) {
    val nic: String = id;
    val accNumber: Int = n;
    var balance: Double = b;

    override def toString = "[" + nic + ":" + accNumber + ":" + balance + "]"

    def withdraw(a: Double): Unit = this.balance = this.balance-a
    def deposit(a :Double): Unit = this.balance = this.balance+a
    def transfer(a:Account,b:Double): Unit = {
      this.withdraw(b)
      a.deposit(b)
    }
  }


  /* Question 1 */
  val find = (n:String, b:List[Account]) => b.filter(x => x.nic.equals(n))
  val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)
  println("List of accounts with negative balances: ")
  println(overdraft(bank).toString())
  println()

  /* Question 2 */
  val balance = (b:List[Account]) => b.reduce((x, y) => new Account(id="", n=0, x.balance+y.balance)).balance
  println("Total of all account balances: ")
  println(balance(bank))
  println()

  /* Question 3 */
  val interest = (b:List[Account]) => b.map(x => if (x.balance >= 0) x.balance+=x.balance*0.05 else x.balance+=x.balance*0.1)
  interest(bank)
  println("Final balance of all accounts after applying the interest function: ")
  println(balance(bank))
  println()

}

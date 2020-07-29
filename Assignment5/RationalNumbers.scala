package Assignment5

object RationalNumbers extends App {

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  class Rational(n: Int, d: Int) {

    require(d > 0, "d must be greater than 0")
    def numerator: Int = n / gcd(n, d).abs
    def denominator: Int = d / gcd(n, d).abs
    def this(n: Int) = this(n, 1)
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def add(r: Rational) = new Rational(this.numerator * r.denominator + r.numerator * this.denominator, this.denominator * r.denominator)

    /* Question 1 */
    def neg = new Rational(-this.numerator, this.denominator)

    /* Question 2 */
    def sub(r: Rational): Rational = this.add(r.neg)
    def -(r: Rational): Rational = this.sub(r)

    override def toString: String = numerator + "/" + denominator
  }

  /* Question 1 - Solution*/
  val Q1result = x.neg
  println(Q1result)
  println()

  /* Question 2 - Solution */
  val Q2result = x - y - z
  println(Q2result)
  println()
}

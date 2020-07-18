package Assignment4

object Cipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encrypt = (c:Char,key:Int,a:String) => a((a.indexOf(c.toUpper)+key)%a.size)
  val Decrypt = (c:Char,key:Int,a:String) => a((a.indexOf(c.toUpper)-key)%a.size)
  val Cipher = (algo:(Char,Int,String) => Char,s:String,key:Int,a:String) => s.map(algo(_,key,a))

  var string1 = "FunctionalProgramming"

  val ct = Cipher(Encrypt,string1,5,alphabet)
  println(ct)

  val pt = Cipher(Decrypt,ct,5,alphabet)
  println(pt)
  
}

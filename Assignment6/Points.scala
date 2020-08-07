package Assignment6

object Points extends App {

    val p1 = Point(2,3)
    val p2 = Point(4,6)


    println(p1)
    println(p2)
    println(p1+p2) //addition of the points p1 and p2
    println(p1.distance(p2)) //the distance between the points p1 and p2
    println(p1.move(3,4)) //move the point p1 by the given amount
    println(p2.invert()) //invert the x and y coordinates of p2


    case class Point(x:Int,y:Int){

        //Question 1
        def +(that:Point)=Point(this.x+that.x,this.y+that.y)

        //Question 2
        def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

        //Question 3
        def invert() = Point(this.y,this.x)

        //Question 4
        def distance(that:Point): Double = scala.math.sqrt(scala.math.pow(that.x-this.x,2)+scala.math.pow(that.y-this.y,2))

    }

}

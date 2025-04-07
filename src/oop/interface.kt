package oop
// interfaces are contracts between classes
// use the keyword interface to create one
// an interface will define any functions which must be implemented on any class that extends the interface
interface Measurements{
    fun area() : Double
    fun perimeter() : Double
}
class Circle(val radius: Double) : Measurements{
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter() : Double {
        return 2 * Math.PI * radius
    }
}

// GET AREA AND PERIMETER OF A SQUARE USING THE INTERFACE
interface Measurement{
    fun area() : Double
    fun perimeter() : Double
}
class Square(val length: Double) : Measurement{
    override fun area(): Double {
        return length * length
    }

    override fun perimeter() : Double {
        return length * 4
    }
}
fun main(){
    val circle1 = Circle(10.0)
    println(circle1.area())
    println(circle1.perimeter())
    val Square1 = Square(20.0)
    println(Square1.area())
    println(Square1.perimeter())
}
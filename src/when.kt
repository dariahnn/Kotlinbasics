// when is a conditional in kotlin that allows comparison
// switches based on a correct match to the condition
var day = 7
fun main(){
//    basic when statement
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6,7 -> println("Weekend")
        else -> println("Invalid day")
    }
    // when expression
    val daytype = when(day){
        in 1 .. 5 -> "weekday"
        6,7 -> "weekend"
        else -> "invalid"
    }
    println(daytype)

//     when like an if..else
    val x = 20
    when {
        x < 0 -> println("negative")
        x > 0 -> println("positive")
        x == 0 -> println("zero")
        else -> println("NaN")
    }


}
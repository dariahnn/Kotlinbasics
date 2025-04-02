fun main(){
    println("Welcome to the club entry system")
    print("Enter your age : ")
    val age = readln().toIntOrNull() ?: 0
    when (age){
        in 1..18 -> println("Access to club denied")
        else -> println("Access to club granted")
    }


}

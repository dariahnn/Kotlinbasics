fun main(){
    println("Welcome to the club entry system")
    print("Enter your age : ")
    val age = readln().toIntOrNull() ?: 0
    if(age >18){
        println("Access granted you are a club member")
    } else{
        println("Access denied you are not a member")
    }
    if (age >18){
        print("Are you a member? (yes/no): ")
        val isMember = readln().equals("yes", ignoreCase = true)
    }
    print("Enter your member number : ")
    val memberNo = readln()
    println("Confirmation message" + memberNo)
    print ("Do you have a VIP pass (yes/no) ")
    val hasVipPass = readln().equals("Yes" , ignoreCase = true)
    if (hasVipPass = true) {
        println("Vip lounge access is granted")

    }
    println(age)
    println(hasVipPass)


}
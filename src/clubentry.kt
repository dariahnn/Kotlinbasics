fun main() {
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age = readln().toIntOrNull()

    if (age == null || age < 0) {
        println("Too young entry to club denied.")
        return
    }
    when {
        age > 18 -> {
            println("Access granted, you are a club member.")
            print("Are you a VIP member? (yes/no): ")
            val isVip = readln().equals("yes", ignoreCase = true)

            if (isVip) {
                println("Welcome VIP! Enjoy your exclusive privileges.")
                print("Do you have a VIP pass? (yes/no): ")
                val hasVipPass = readln().equals("yes", ignoreCase = true)

                if (hasVipPass) {
                    println("Enjoy VIP.")
                } else {
                    println("Standard VIP access granted.")
                }
            } else {
                println("You are a regular member.")
                print("Are you a member? (yes/no): ")
                val isMember = readln().equals("yes", ignoreCase = true)

                if (isMember) {
                    print("Enter your member number: ")
                    val memberNo = readln()
                    println("Confirmation message: Your member number is $memberNo")
                } else {
                    println("You are jot a member.")
                    return
                }

                print("Do you have a VIP pass? (yes/no): ")
                val hasVipPass = readln().equals("yes", ignoreCase = true)

                if (hasVipPass) {
                    println("You are Vip enjoy")
                } else {
                    println("Non Vip access granted.")
                }
            }
        }
        else -> {
            println("Access denied. You are not a member.")
        }
    }
}

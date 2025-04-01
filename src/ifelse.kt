// Kotlin has the following conditionals
// 1. Use of if to specify that a block of code is to be executed if condition is true
// 2. Use of else to specify if the above condition is false
// 3. else if to add new conditions to our test
// 4. When to specify many alternatives to be executed
var a = 40
var b = 40
fun main(){
    if(a > b){
        println("$a is greater than $b")
    } else if(a < b){
        println("$a is less than $b")
    }else if(a == b){
        println("$a is equal to $b ")
    }
    else {
        println("$a is less than $b")
    }

}
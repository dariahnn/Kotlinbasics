// "content" : strings to store text
// strings contains a collection of characters surrounded by double quotes ""

var txt = "Hello world"
// string concatenation
var firstname = "Darian"
var lastname = "Ananda"
fun main(){
//    accessing character in a string
    println(txt[4])
//     getting the length of the string
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    var fullname = "my name is " + firstname + " " + lastname
    println(fullname)
    println("My name is  $firstname $lastname")


}
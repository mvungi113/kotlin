fun main() {
//    var name = "ROGASIAN"
//    println("Hello World! $name")
    val message = happyBirthday("Rogasian", 24)
    println(message)

    val user = userInfo(id = 1, age=24, name = "Rogasian")
    println(user)

    defAgu("ROGASIAN")
    defAgu()

}
// default function return type is Unit
//fun happyBirthday(){
//    println("Happy Birthday to you")
//}


// passing argument to the function
//fun happyBirthday(name:String, age:Int){
//    println("Happy Birthday $name you are $age years old")
//}

// Return type String
fun happyBirthday(name: String, age: Int): String{
    val greeting = "Happy Birthday, $name!"
    val yourAge = "You are now $age years old"
    return  "$greeting $yourAge"
}

// Named Arguments

fun userInfo(name: String, age: Int, id: Int): String{

    return "Name: $name \nAge: $age \nID: $id"
}
//default argument
fun defAgu(name:String = "User"){
    println("Hello! your $name!")
}
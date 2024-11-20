fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello Again")
    printMessageWithPrefix("Hello", "Log")
//    Named argument
    printMessageWithPrefix(prefix = "Log", message = "Hello prefix")

    println(sum(1,4))
    println(multiply(5,4))
}

// function that takes a parameter of type string and return Unit
fun printMessage(message: String){
    println(message)
}
// a function that takes a second optional parameter with default value Info.
fun printMessageWithPrefix(message:String, prefix:String = "Info"){
    println("[$prefix] $message")
}
// A function that return an integer
fun sum(a:Int, b:Int): Int{
    return a + b
}


// A single expression function that returns an integer
fun multiply(x:Int, y:Int)= x * y
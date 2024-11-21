//when statement

fun cases (obj :Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

fun main(){
    cases("Hello")
    cases(1)
    cases(0L)
    cases("hello")
    cases(MyClass())


//    whe expression
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

class MyClass


fun whenAssign(obj : Any) :Any{
    val result = when (obj){
        1 -> "One"
        "Hello" ->  1
        is Long -> false
        else -> "Unknown"
    }
    return result
}



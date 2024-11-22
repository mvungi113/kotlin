fun main(){
    val upperCase1 : (String) -> String = {str:String -> str.uppercase()}
    val upperCase2: (String) -> String = {str -> str.uppercase()}
    val upperCase3 = { str : String -> str.uppercase()}
//    you can not do both together, the compiler has no chance to infer the type that way
//    val upperCase4 = {str -> str.uppercase()}

    val upperCase5: (String) -> String = {it.uppercase()}
    val upperCase6: (String) -> String = String::uppercase


    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

    val haujambo = habari
    haujambo()
    habari()
}
// this is lambda function

// val variableName ={

// function Body

//}


var habari = {
    println("Habari za Asubuhi")
}
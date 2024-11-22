fun calculate(x:Int, y: Int, operation : (Int, Int)-> Int):Int{
    return operation(x, y)
}
fun sumNumbers(x : Int, y : Int) = x + y


fun main(){
    val sumResult = calculate(4,5, ::sum)
    val multResult = calculate(4,5) {a, b -> a * b}
    println("The sumResult is : $sumResult and The multResult is : $multResult")


    val func = operation()
    println(func(2))
}

//returning function

fun operation() : (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

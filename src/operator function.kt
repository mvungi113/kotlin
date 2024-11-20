fun main(){

//    this takes the infix function frm above one step further using the operator modifier
    operator fun Int.times(str: String) = str.repeat(this)
    //the operator symbol for times( is * so that you can call the function using 2 * "Bye "
    println(2 * "Bye ")
//  An operator function allows easy range access on strings
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14]) // The get() operator enables brackets-access syntax.
}
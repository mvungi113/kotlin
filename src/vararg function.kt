fun main() {


//    this allows calling printlAll with any number string arguments
    printAll("Hello", "Habari", "Hallo", "Salut", "Hola")
//    using named parameters, you can set a value to prefix separately from the vararg
    printAllWithPrefix("Hello", "Habari","Hallo","Hola", prefix = "Greating ")


    log("Hello", "Habari", "Hallo", "Salut", "Hola")
}

// this vararg modifier turns a parameter into a vararg.
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}
// you can even add another parameter of the same type after the vararg.
//this wouldn't be allowed in Java because there's no way to pass a value.
fun printAllWithPrefix(vararg messages: String, prefix:String){
    for (m in messages) println(prefix + m)
}


// At runtime, a vararg is jus an array. To pass it long into a vararg parameter, use the special
//spread operator * that lets you pass in *entries (a vararg of String) instead of entries an Array<String>
fun  log(vararg entries: String){
    printAll(*entries)
}
fun main(){
    //defines an infix extension function on Int
    infix fun Int.times(str:String) = str.repeat(this)
    println(3 times "Bye ") // call the infix function


    // Creates a pair by calling the infix function to from the standard library
    val pair ="Ferrari" to "Katrina"
    println(pair)

    // here's your own implementation of to creatively called onto
    infix fun String.onto(other:String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia // Infix notation also works on members functions (methods)
}

class Person(val name:String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other:Person){ likedPeople.add(other)} // the containing class becomes the first parameter
}
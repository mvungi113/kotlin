fun main() {

//    iterate over range starting from 0up to 5(inclusive).

    for (i in 0..5) {
        println(i)
    }
//starting from 0 p to 3(exclusive)
    for (i in 0 until 3){
        println(i)
    }
//iterate over the range with custom increment
    for (i in 2..8 step 2){
        println(i)
    }
    // iterate over the range in reverse order
    for (i in 3 downTo 0){
        println(i)
    }

    //char ranges also supported
    for(c in 'a'..'d' step 2){
        println(c)
    }
    for (c in 'z' downTo 'a' step 3){
        println(c)
    }

//    range also a useful in if Statements

    val x =2
    if(x in 1..5){
        println("X is in range from 1 to 5")
    }
    if(x !in 6..10){
        println("X is not in range from 6 to 10")
    }

}
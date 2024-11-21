fun main(){
    // for loops
    val cakes = listOf("Carrot", "Cheese", "Chocolate")
    for(cake in cakes){
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten  = 0
    var cakesBaked = 0

    // while loop
    while (cakesEaten < 5){
        eatACake()
        cakesEaten ++
    }

    // do while

    do {
        bakeACake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)



    //

    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion"), Animal("Birds")))

    for (animal in zoo){
        println("Watch out, It's a ${animal.name}")
    }
}

fun eatACake(){
    println("Eat a Cake")
}

fun bakeACake(){
    println("Bake a Cake")
}


// iterators
class Animal(val name : String)

class Zoo(val animals : List<Animal>){
    operator fun iterator() : Iterator<Animal>{
        return animals.iterator()
    }
}
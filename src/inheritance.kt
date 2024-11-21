
open class Dog(){
    open fun sayHello(){
        println("Wow Wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
       println("Wif Wif!")
    }
}


fun main(){
    val dog : Dog = Yorkshire()
    dog.sayHello()

    val dogs = Dog()
    dogs.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()


    val lion:Lion = Asiatic("Rufo")
    lion.sayHello()
}


//Inheritance with Parameterized Constructor

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")


//passing  Constructor arguments to superclass
open class Lion(val name: String, val origin : String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh!")
    }
}
class Asiatic(name: String) : Lion(name=name, origin = "India")


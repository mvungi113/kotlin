
// defines a generic class where E is called the generic type parameter. At use site
// its assigned to a specific type such as Int by declaring a MutableStack<Int>
class MutableStack<E> (vararg items: E){
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek() : E = elements.last()

    fun pop() : E = elements.removeAt(elements.size -1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


//generic function

fun<E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main(){
    val stack =mutableStackOf(0.62,3.14, 2.7)
    println(stack)
}
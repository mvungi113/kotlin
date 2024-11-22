fun main(){
    val state = State.RUNNING
    val message = when (state){
        State.IDLE -> "It's Idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's Finished"
    }
    print(message)


    val red = Color.RED
    val blue =Color.BLUE
    val green = Color.GREEN
    val yellow = Color.YELLOW
    println(red)

    println(red.containsRed())
    println(green.containsRed())
    println(blue.containsRed())
    println(yellow.containsRed())
}

enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

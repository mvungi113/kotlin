

fun main(){
    val salamu = salamuYaAsubuhi

    salamu("Asubuhi", "Haji")
    salamuYaAsubuhi("Mchana", "Demo")
}

val salamuYaAsubuhi: (String, String) -> Unit ={ majira, jina ->
    println("Habari za $majira $jina")
}
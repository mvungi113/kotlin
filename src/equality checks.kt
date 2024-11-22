fun main(){
    val authors = setOf("Haji", "Rogasian", "Mvungi")
    val writers = setOf("Rogasian","Mvungi", "Haji", )

    // it returns true because it calls authors.equals(writers) and sets ignore element order
    println(authors == writers)
    // returns false because authors and writers are distinct references
    println(authors === writers)
}
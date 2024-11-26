class Student(val name: String, var age: Int) {
    var grade: String = "Not Graded"
    fun showStudent() {
        println("$name $age $grade")
    }
    // Secondary constructor
    constructor(name: String, age: Int, grade: String) : this(name, age) {
        this.grade = grade
        println("Student initialized with grade: $grade")
    }
}

fun main() {
    val student1 = Student("Bob", 20)

// Uses the primary constructor
    val student2 = Student("Bob", 20, "A") // Uses the secondary constructor
    student1.showStudent()
}

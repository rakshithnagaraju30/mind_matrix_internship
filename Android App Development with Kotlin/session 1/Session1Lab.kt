
//session lab
//Variables and Strings

fun main() {
    
    val name = "Rakshith"
    val age = 21
    val college = "XYZ Engineering College"
    val cgpa = 8.5

    println("My name is $name.")
    println("I am $age years old.")
    println("I study at $college.")
    println("My CGPA is $cgpa.")
}

//Functions

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = addNumbers(10, 20)
    println("Sum is $result")
}

//Lists

fun main() {
    val languages = listOf("Kotlin", "Java", "Python", "C++", "JavaScript")

    println("Languages: $languages")
    println("First language: ${languages[0]}")
    println("Total languages: ${languages.size}")
}

//Mini Practice Program

fun calculateAverage(marks: List<Int>): Double {
    val sum = marks.sum()
    return sum.toDouble() / marks.size
}

fun main() {
    val marks = listOf(85, 90, 78, 88, 92)

    val average = calculateAverage(marks)

    println("Marks: $marks")
    println("Average marks: $average")
}
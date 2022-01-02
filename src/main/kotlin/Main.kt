import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)

    println("*********Student Info Management*********\n")
    print("Enter total student number: ")
    val n = scn.nextInt()
    scn.nextLine()

    val studentArray = Array<Student?>(size = n) { null }

    for (i in studentArray.indices) {
        print("${i + 1}. Enter Student Name:")
        val name = scn.nextLine()

        print("Enter Roll: ")
        val roll = scn.nextInt()
        scn.nextLine()

        print("Enter Class Name: ")
        val className = scn.nextLine()

        print("Enter Marks(Bangla): ")
        val banglaMarks = scn.nextDouble()

        print("Enter Marks(English): ")
        val englishMarks = scn.nextDouble()

        print("Enter Marks(Math): ")
        val mathMarks = scn.nextDouble()
        scn.nextLine()

        val bangla = Subject(
            name = "Bangla",
            code = 111,
            totalMarks = 100.0,
            earned = banglaMarks
        )

        val english = Subject(
            code = 112,
            name = "English",
            totalMarks = 100.0,
            earned = englishMarks
        )

        val math = Subject(
            code = 113,
            name = "Math",
            totalMarks = 100.0,
            earned = mathMarks
        )

        studentArray[i] = Student(
            name = name,
            className = className,
            bangla = bangla,
            english = english,
            math = math,
            roll = roll,
        )
    }

    println("\nEntered Student Name:")
    for (s in studentArray) {
        if (s != null) {
            println(s.name)
        }
    }
}
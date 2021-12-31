import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)

    println("*********Student Info Management*********\n")
    print("Enter total student number: ")
    val n = scn.nextInt()

    val studentArray = Array<Student?>(size = n) { null }

    for (i in studentArray.indices) {
        val scn2 = Scanner(System.`in`)
        print("${i + 1}. Enter Student Name:")
        val name = scn2.nextLine()
        studentArray[i] = Student(name)
    }

    println("\nEntered Student Name:")
    for (s in studentArray) {
        if (s != null) {
            println(s.name)
        }
    }


}
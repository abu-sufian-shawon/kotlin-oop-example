import java.util.Scanner

fun main(){

   val scn = Scanner(System.`in`)

    println("*********Student Info Management*********\n\n")
    print("Enter total student number: ")
    val n = scn.nextInt()

    val studentArray = Array<Student?>(n){null}

    studentArray[0] = Student("Abu Sufian", 105269, 295479, "Computer")

    // Hello Madam!
}
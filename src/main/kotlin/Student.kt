class Student(
  private var name: String,
  private var roll: Int,
  private var className: String,
  private var bangla: Subject,
  private var english: Subject,
  private var math: Subject
) {

  fun display() {
    println("\tName : $name")
    println("\tClass Name: $className")
    println("\tRoll : $roll")
    println("\tBangla Marks: ${bangla.getMarks()}")
    println("\tEnglish Marks: ${english.getMarks()}")
    println("\tMath Marks : ${math.getMarks()}")
  }

  fun totalEarnedMarks(): Double {
    return bangla.getMarks() + english.getMarks() + math.getMarks()
  }

  fun setRoll(r: Int) {
    roll = r
  }

}
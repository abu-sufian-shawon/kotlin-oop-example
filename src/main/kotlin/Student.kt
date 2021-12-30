class Student(
    private var name:String,
    private var roll:Int,
    private var registration:Long,
    private var department:String
){
    fun displayInfo(){
        println("Student Name: $name")
        println("Student Roll: $roll")
        println("Student Registration: $registration")
        println("Student Department: $department")
    }
}
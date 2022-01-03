class Subject(
    private var code:Int,
    private var name:String,
    private var totalMarks:Double,
    private var earned:Double
) {

    fun getMarks():Double{
        return earned
    }
}
// Class with contractor

class Person (var Name: String) {
//    functions
    fun display() {
        println("Display: $Name")
    }

//    lambda
    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }
}
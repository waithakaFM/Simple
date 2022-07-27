fun main(args: Array<String>) {
    println("Hello World!")

    val frank = Person("Franko")


    println("Name is ${frank.Name}")
    frank.display()

//    calling lambda: Lambda expressions allow passing a function as an input parameter for another function
    frank.displayWithLambda(::printName)
}

fun printName(name: String){
    println(name)
}
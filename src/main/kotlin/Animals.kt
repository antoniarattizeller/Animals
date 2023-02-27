
//provides a default code for creating a generic animal
//declaring 'open' tells the compiler that this class can be used as superclass
open class Animal {
    //Animal class properties:
    //declating 'open' to be able to override the image, food, habitat properties
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10 //var because hunger changes

    //declaring 'open' to be able to override the function in subclass
    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}
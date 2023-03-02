fun main(args: Array<String>) {
    val wolf = Wolf()
    println("wolf: ")
    wolf.makeNoise() //overridden in the Wolf class
    wolf.roam() //overridden in the Canine class
    wolf.sleep() //function only in the Animal class

    println()
    //1. Animal and Wolf are explicitly different types,
    //   but because Wolf IS-A type of Animal, the code compiles
    //2. creates a Wolf object and
    //   assigns it to a variable of type Animal
    val animal : Animal = Wolf()
    println("animal: ")
    animal.eat()


    println()
    //  compiler spots that these are types of Animal,
    //  so it creates an array of type Array<Animal>
    val animals = arrayOf(Hippo(), Wolf(), Canine())
    println("animals: ")
    //  looping through the animals array and calls functions
    //  each animal responds in a way that's appropriate to its typr
    for (item in animals){
        item.roam()
        item.eat()
    }
}
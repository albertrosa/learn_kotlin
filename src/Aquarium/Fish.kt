package Aquarium

class Fish(val friendly: Boolean = true, volumneNeeded: Int) {

    val size: Int

    init {
        println("first init")
    }

    constructor() : this(true, 9) {
        println("Russing sdecond constructuor")
    }

    init {
        if (friendly) {
            size = volumneNeeded
        } else {
            size = volumneNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumneNeeded")
    }

    init {
        println("last init")
    }

}

fun makeDefaultFish() = Fish(true, 50)

fun main (args: Array<String>) {
    val fish = Fish(true, 20)
    println("Is the fish Friendly: ${fish.friendly}. It needs volumne ${fish.size}")
 }
package Aquarium

abstract class AquariumFish {
    abstract val color : String
}

class Shark: AquariumFish(), fishAction {
    override val color = "gray"

    override fun eat() { println("hunt and eat fish")}
}

class Plecostomus: AquariumFish(), fishAction {
    override val color = "gold"

    override fun eat() {
        println("Munch on Algae")
    }
}

interface  fishAction {
    fun eat()
}
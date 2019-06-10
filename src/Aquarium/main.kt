package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
    makeFish()


}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("Length ${myAquarium.length}"+
            "\nWidth ${myAquarium.width}" +
            "\nHeight: ${myAquarium.height}"
    );

    println("Volumne: ${myAquarium.volume} liters")

    myAquarium.height = 80

    println("Volumne: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30);
    println("Small Aquarium Volumn: ${smallAquarium.volume} litters")

    val myAquarium2 = Aquarium(numberOfFish = 2)
    println("Aquarium2 Volumn: ${myAquarium2.volume} litters")

}

fun feedFish (fish: fishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()

    feedFish(shark)

}
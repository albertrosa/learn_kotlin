fun main (args: Array<String>) {
    if (canAddFish(10.0, listOf(3,3,3)) != false) {println("ERROR 1")}
    if (canAddFish(8.0, listOf(2,2,2), hasDecorations = false) != true) {println("ERROR 2")}
    if (canAddFish(9.0, listOf(1,1,3), 3) != false) {println("ERROR 3")}
    if (canAddFish(10.0, listOf(), 7, true) != true) {println("ERROR 4")}
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean {
    var tankSizeFinal = tankSize
    if (hasDecorations) { tankSizeFinal = tankSize.times(0.80) }

    return ( tankSizeFinal >= currentFish.sum() + fishSize)
}
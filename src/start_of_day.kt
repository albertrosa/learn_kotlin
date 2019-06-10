fun main (args: Array<String>){
    println("Hello worlds")
    BasicOperations()
    practiceVariables()
    practiceNullability()
    fishComp("Pi")
    fishComp("")
    fishComp("FrankyClown")
    practiceLoop()
}


fun BasicOperations() {
    var result =2.plus(71).plus(233).minus(13)
    var totalTanks = result.div(30)

    println("remaining fish: $result")
    println("Fishtanks needs: $totalTanks")
}


fun practiceVariables() {
    var rainbowColor = "Red"
    val blackColor = "#000"

    rainbowColor = "#cdcdcd"
//    blackColor = "#fff"
}

fun practiceNullability() {
    var rainbowColor = null
    var greenColor: String;
    var blueColor: Int? = null

    var me: List<Int?> = listOf(null, null)
    var me2: List<Int>? = null;

    var nInt : Int? = null

    var result = nInt?.plus(1) ?: 0
    println(result)
    nInt = 3
    result = nInt?.plus(1) ?: 0
    println(result)
}

fun fishComp(fish: String) {
    when(fish.length){
        0 -> println("Error: No Fish")
        in 3..12 -> println("Good Fish Name")
        else -> println("Ok Fish Name")
    }
}

fun practiceLoop() {
    val numbers = listOf(11..15)
    val sAr = mutableListOf<String>()

    for (i in numbers) {
        sAr.add(i.toString())
    }

    println(numbers)
    println(sAr)

    for (i in 1..100 step 7){
        println(i)
    }
}

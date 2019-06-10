fun main (args: Array<String>) {
    println(
        whatShouldIDoToday("happy")
    )

    print("How do you feel? (sad, happy, etc)")
    println(
        whatShouldIDoToday(readLine()!!)
    )
}

fun isHappyAndSunny(mood:String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadColdAndRainy(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHot(temperature: Int) = temperature > 35

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature:Int = 24) :String {
    return when {
        isHappyAndSunny(mood, weather) -> "go for a walk"
        isSadColdAndRainy(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}
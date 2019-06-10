fun main(args: Array<String>){
    var hour = args?.get(0)?.toInt()

    when (hour) {
        in 0..11 -> println("Good Morning, Kotlin")
        in 12..23 -> println("Good Night, Kotlin")
        else -> println("When are we Kotlin?")
    }
}
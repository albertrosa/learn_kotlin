fun main(args: Array<String>) {
    print("Your fortune is:\n ${getFortuneCookie(getBirthday())}")
}

fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when (birthday) {
        in 1..10 -> fortunes[0]
        in 11..13 -> fortunes[1]
        in 14..16 -> fortunes[2]
        in 17..19 -> fortunes[3]
        in 20..24 -> fortunes[4]
        in 25..27 -> fortunes[5]
        in 28..31 -> fortunes[6]
        else -> "We have a problem"
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")

    var result = readLine()?.toIntOrNull()

    if (result != null) {
        return result
    }

    return 0
}
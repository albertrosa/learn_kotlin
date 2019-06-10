import java.util.*

fun main(args: Array<String>){
    println("Hello ${args[0]}")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("It's Sunday")
        2 -> println("It's Monday")
        3 -> println("It's Tuesday")
        4 -> println("It's Wednesday")
        5 -> println("It's Thursday")
        6 -> println("It's Friday")
        7 -> println("It's Saturday")
        else -> println("Looks like a problem")
    }
}
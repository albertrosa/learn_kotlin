import java.util.*

fun main(args: Array<String>){
 println("Hello World");
 feedTheFish()
}

fun feedTheFish(){
 var day = randomDay()
 var food = fishFood(day)

 println("Today is ${day} and the fish eats ${food}")
 swim(50, speed="slow")

 shouldChangeWater(day, 20, 20)
 shouldChangeWater(day)
 shouldChangeWater(day, dirty = 50)
 shouldChangeWater(day="monday")

 if (shouldChangeWater(day)) {
  println("Chnage the water today")
 }
}

fun isTooHot(temperature: Int) = temperature > 30

fun getDirtySesorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySesorReading()) : Boolean{

 val isTooHot = isTooHot(temperature)
 val isDirty = dirty > 30
 val isSunday = day == "Sunday"

 return when {
  isTooHot -> true
  isDirty -> true
  isSunday -> true
  else -> false
 }
}

fun swim (time: Int, speed: String = "fast") {
 println("Swimming $speed")
}

fun randomDay(): String {
 var week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
 return week.get(
  Random().nextInt(7)
 )
}

fun fishFood (day: String) : String {
 return when(day) {
  "Monday" -> "Flakes"
  "Tuesday" -> "pellets"
  "Wednesday" -> "redworms"
  "Thursday" -> "granules"
  "Friday" -> "mosquitos"
  "Saturday" -> "lettuce"
  "Sunday" -> "plankton"
  else -> "fasting"
 }
}
package Practice

fun main (args: Array<String>) {

    val spice1 = Curry("Spicy", YellowSpiceColor)
    var containr = SpiceContainer(spice1)

    println(containr.label)

}

sealed class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {

    val heat : Int
        get () =
            when (spiciness){
                "zero" -> 0
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
    init {
        println("You have Created $name with a spiciness level of $spiciness")
    }

    abstract fun prepareSpice()
}

class Curry(spiciness: String, color: SpiceColor = YellowSpiceColor ): Spice("curry", spiciness, color ), Grinder{
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color: Color = Color.YELLOW
}

object RedSpiceColor: SpiceColor {
    override val color: Color = Color.RED
}

object GreenSpiceColor: SpiceColor {
    override val color: Color = Color.GREEN
}

data class SpiceContainer(val spice: Spice){
    val label: String = "${spice.name} spice"
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}
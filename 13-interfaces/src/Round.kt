import kotlin.math.round

class Round(color: String, val radius: Double) : Figure(color){

    override fun area(): Double {
        return round(Math.PI * radius * radius)
    }

    override fun length(): Double {
        return round(2 * Math.PI * radius)
    }
}
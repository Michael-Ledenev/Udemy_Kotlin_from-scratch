import kotlin.math.round
import kotlin.math.sqrt

class Triangle(color: String, val a: Double, val b: Double, val c: Double) : Figure(color) {

    override fun area(): Double {
        val p = (a + b + c) / 2
        return round(sqrt(p * (p - a) * (p - b) * (p - c)))
    }

    override fun length(): Double {
        return round(a + b + c)
    }
}
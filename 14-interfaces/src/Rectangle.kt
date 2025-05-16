import kotlin.math.round

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {

    override fun area(): Double {
        return round(width * height)
    }

    override fun length(): Double {
        return round(2 * (width + height))
    }

    fun isSquare(): Boolean {
        return width == height
    }

}
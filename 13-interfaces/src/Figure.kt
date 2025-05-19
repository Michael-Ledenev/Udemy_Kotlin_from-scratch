abstract class Figure(val color: String) : Movable {
    var x: Int = 0
    var y: Int = 0

    override fun moveLeft(step: Int) {
        x += step
        println("$color фигура переместилась влево")
    }

    override fun moveRight(step: Int) {
        x -= step
        println("$color фигура переместилась вправо")
    }

    override fun moveDown(step: Int) {
        y += step
        println("$color фигура переместилась вниз")
    }

    override fun moveUp(step: Int) {
        y -= step
        println("$color фигура переместилась вверх")
    }

    abstract fun area(): Double
    abstract fun length(): Double
}
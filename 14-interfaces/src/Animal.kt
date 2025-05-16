class Animal(val name: String): Movable {
    var x: Int = 0
    var y: Int = 0

    override fun moveLeft(step: Int) {
        x -= step
        println("$name передвинулся влево")
    }

    override fun moveRight(step: Int) {
        x += step
        println("$name передвинулся вправо")
    }

    override fun moveDown(step: Int) {
        y += step
        println("$name передвинулся вверх")
    }

    override fun moveUp(step: Int) {
        y -= step
        println("$name передвинулся вниз")
    }

}
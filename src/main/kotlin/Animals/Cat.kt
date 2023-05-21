package Animals

class Cat(food:String, location:String, powerOfMeow:Int) : Animal(food, location) {
    public val powerOfMeow = powerOfMeow
    override fun eat() {
        println("Кот ест")
    }

    override fun makeNoise() {
        println("Мяу ".repeat(powerOfMeow))
    }

    override fun sleep() {
        println("Кот спит")
    }
}
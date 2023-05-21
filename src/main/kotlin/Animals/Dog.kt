package Animals

class Dog(food:String, location:String, powerOfWoof:Int) : Animal(food, location){
    public val powerOfWoof = powerOfWoof
    override fun eat() {
        println("Пёс ест")
    }

    override fun makeNoise() {
        println("Гав-гав ".repeat(powerOfWoof))
    }

    override fun sleep() {
        println("Пёс спит")
    }
}
package Animals

abstract class Animal(food:String, location:String) {
    public val food = food
    public val location = location

    abstract fun makeNoise()
    abstract fun eat()
    abstract fun sleep()
}
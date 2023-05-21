package Animals

class Horse(food:String, location:String, speed:Double) : Animal(food, location){
    public val speed = speed
    override fun eat() {
        println("Конь ест")
    }

    override fun makeNoise() {
        println("И-го-го")
    }

    override fun sleep() {
        println("Конь спит")
    }
}
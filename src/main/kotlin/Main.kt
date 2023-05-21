import Animals.*

fun main() {
    var animals = arrayListOf<Animal>(Cat("корм", "Москва", 2), Dog("мясо", "Новгород", 3), Horse("сено", "Астана",50.5))
    println("Животные едят")
    animals.forEach{
        it.eat()
    }
    println("Животные издают звуки")
    animals.forEach{
        it.makeNoise()
    }
    println("Животные спят")
    animals.forEach{
        it.sleep()
    }
    println("Животных привели к ветеринару")
    var vet = Veterinarian()
    animals.forEach {
        vet.treatAnimal(it)
    }
}
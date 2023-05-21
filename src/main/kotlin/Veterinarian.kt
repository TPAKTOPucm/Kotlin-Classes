import Animals.Animal

class Veterinarian {
    public fun treatAnimal(animal : Animal){
        println("Ест: ${animal.food}\nОбитает: ${animal.location}")
    }
}
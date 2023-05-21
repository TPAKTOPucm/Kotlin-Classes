import Animals.*
import Words.Words
import Message.Message

fun task1(){
    println("Создание 1-го экземпляра класса")
    Words()
    println("Создание 2-го экземпляра класса")
    Words()
}
fun task2(){
    var a = Message("Alice")
    var b = Message("Bob")
    a.introduce()
    b.introduce()
}
fun task3() {
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
fun main() {
    println("Практическая работа №1")
    task1()
    println("Практическая работа №2")
    task2()
    println("Практическая работа №3")
    task3()
}
package Message

class Message(userName: String) {
    public val userName = userName
    public fun introduce(){
        println("Привет, меня зовут ${userName}")
    }
}
fun main() {
    println("🐱 Привет! Я Филя!")
    println("Как тебя зовут?")
    
    val name = readln()
    
    print("$name... ")
    Thread.sleep(800)
    
    println("хорошее имя! 😺")
    Thread.sleep(500)
    
    println("Сколько тебе лет?")
    val age = readln()
    
    print("думаю...")
    Thread.sleep(1000)
    
    println(" $age? Класс! 🎉")
    Thread.sleep(500)
    println("а мне 5,3 месяца.")
    println("А ты кот¿ (yes/no)")
    val yn = readln()
    if (yn == "yes") {
        println("круть😺")
    } else {
        println("ладно🤨")
    }
}
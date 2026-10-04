fun main() {
    println("🐱 Hi! I'm Filya!")
    println("What's your name?")
    
    val name = readln()
    
    print("$name... ")
    Thread.sleep(800)
    
    println("nice name! 😺")
    Thread.sleep(500)
    
    println("How old are you?")
    val age = readln()
    
    print("thinking...")
    Thread.sleep(1000)
    
    println(" $age? Cool! 🎉")
    Thread.sleep(500)
    println("I'm 5.3 months old.")
    println("Are you a cat? (yes/no)")
    val yn = readln()
    if (yn == "yes") {
        println("awesome😺")
    } else {
        println("okay🤨")
    }
}
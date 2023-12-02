import sun.rmi.runtime.Log

// Argumentos Variaveis
fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun someCondition() = true

fun main(){
    printMessage("Olá")
    printMessageWithPrefix("Olá", "log")
    printMessageWithPrefix("Olá")
    printMessageWithPrefix(prefix = "log", message = "Olá")
    println(sum(1,2))
    println(multiply(2,4))


//     Funções Vararg
    fun printAll(vararg messages: String){
        for(m in messages) println (m)
    }
    printAll("Hello", "Olá", "Salut", "Hola", "Ohaio")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "hello", "hallo", "salut", "Hola", prefix = "Saudação "
    )

    fun log(vararg entries: String){
        printAll(*entries)
    }
    log("Hello", "Olá", "Salut", "Hola", "Ohaio")


//     Var = mutavel, Val = imutavel
    var a: String = "Initial"
    println(a)
    val b: Int = 1
    val c = 3
    println(b)
    println(c)


    val d: Int

    if (someCondition()){
        d = 1
    }else{
        d = 2
    }

    println(d)

}

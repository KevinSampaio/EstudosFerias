class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    //Recebe um Elemente (E) e coloca na pilha
    fun push(element: E) = elements.add(element)        // 2

    //Pega o ultimo elemente da pilha mas, sem remover
    fun peek(): E = elements.last()                     // 3

    //Remove um item da pilha
    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    //Mostra o tamanho da pilha
    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


fun main() {
    //dando push na pilha
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    //for para remover itens da pilha 1 por 1
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
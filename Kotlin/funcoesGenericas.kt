class MutablesStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutablesStack(${elements.joinToString()})"
}


fun <E> mutablesStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutablesStackOf(0.62, 3.14, 2.7)
    println(stack)
}

// <> = Especificador
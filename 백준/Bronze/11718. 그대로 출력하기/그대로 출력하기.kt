fun main() {
    while (true) {
        readLine()?.let { value ->
            if (value.isNotBlank()) {
                println(value)
            }
        } ?: break
    }
}
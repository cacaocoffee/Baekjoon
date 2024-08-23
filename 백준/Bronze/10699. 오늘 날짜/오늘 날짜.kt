import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ISO_DATE
    val formatted = current.format(formatter)

    println("$formatted")
}
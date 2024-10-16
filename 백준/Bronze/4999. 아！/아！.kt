import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val answer = nextLine()
    val request = nextLine()
    if(answer.contains(request)) print("go")
    else print("no")
}
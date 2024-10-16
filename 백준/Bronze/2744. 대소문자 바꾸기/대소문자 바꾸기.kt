import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input = nextLine()
    var answer = StringBuilder() 

    input.forEach { 
        if (it in 'a'..'z') {
            answer.append(it.uppercaseChar()) 
        } else if (it in 'A'..'Z') {
            answer.append(it.lowercaseChar()) 
        } 
    }
    print(answer.toString())
    
}
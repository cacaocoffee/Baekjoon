import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val M = br.readLine().toInt()
    val list = IntArray(21)
    val sb = StringBuilder()
    
    repeat(M) {
        val input = br.readLine().split(" ")
        val oper = input[0]
        
        when (oper) {
            "add" -> {
                val num = input[1].toInt()
                list[num] = 1
            }
            "check" -> {
                val num = input[1].toInt()
                sb.append(list[num]).append("\n")
            }
            "remove" -> {
                val num = input[1].toInt()
                list[num] = 0
            }
            "toggle" -> {
                val num = input[1].toInt()
                list[num] = if (list[num] == 0) 1 else 0
            }
            "empty" -> {
                for (i in list.indices) {
                    list[i] = 0
                }
            }
            "all" -> {
                for (i in list.indices) {
                    list[i] = 1
                }
            }
        }
    }
    print(sb.toString())
}

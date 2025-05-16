import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val lockerMap = HashMap<Long, Int>()
    val output = StringBuilder()

    repeat(n) {
        val cmd = br.readLine().split(" ")
        when (cmd[0]) {
            "1" -> {
                val locker = cmd[1].toInt()
                val weight = cmd[2].toLong()
                lockerMap[weight] = locker
            }
            "2" -> {
                val weight = cmd[1].toLong()
                output.appendLine(lockerMap[weight])
            }
        }
    }

    print(output)
}

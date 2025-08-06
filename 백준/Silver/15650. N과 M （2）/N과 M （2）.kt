import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val combination = IntArray(m)
    
    printCombinations(n, m, 0, 1, combination)
}

fun printCombinations(n: Int, m: Int, depth: Int, start: Int, combination: IntArray) {
    if (depth == m) {
        println(combination.joinToString(" "))
        return
    }

    for (i in start..n) {
        combination[depth] = i
        
        printCombinations(n, m, depth + 1, i + 1, combination)
    }
}
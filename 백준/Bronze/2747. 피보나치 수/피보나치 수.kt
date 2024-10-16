import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val fibonaci = IntArray(a + 1)

    fibonaci[0]=0
    fibonaci[1]=1
    for(i in 2..a){
        fibonaci[i]= fibonaci[i-1]+fibonaci[i-2]
    }
    print(fibonaci[a])
}
import java.util.Scanner
fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var f=Array<Long>(n+1,{0})
    f[1]=1
    for(i in 2..n){
        f[i]=f[i-1]+f[i-2]
    }
    print(f[n])
}
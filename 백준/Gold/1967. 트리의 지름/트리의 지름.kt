import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max
 
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
val n = readLine()!!.toInt()
val graph = MutableList(n+1,{ mutableListOf<Int>()})
val dist = MutableList(n+1,{ mutableListOf<Int>()})
var visit = BooleanArray(n+1,{false})
var ans = Int.MIN_VALUE
var key = 0
fun main()=with(br){
    for(i in 0 until n-1){
        var line = readLine()!!.split(" ").map{it.toInt()}
        graph[line[0]].add(line[1])
        graph[line[1]].add(line[0])
        dist[line[0]].add(line[2])
        dist[line[1]].add(line[2])
    }
    bfs(1,0)
//    println()
//    println(ans)
//    println(key)
    visit = BooleanArray(n+1,{false})
    ans = 0
    bfs(key,0)
    bw.write("$ans")
    bw.flush()
    bw.close()
}
 
fun bfs(v:Int,distance:Int){
    if(distance>ans) {
        ans = distance
        key = v
    }
    visit[v]=true
    var index = 0
    for(i in graph[v]){
        if(!visit[i]){
//            print("$i ")
            bfs(i,distance+dist[v][index])
        }
        index++
    }
}
 
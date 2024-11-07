fun main() {
    val num = readLine()!!.toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    
    repeat(num) {
        val (start, end) = readLine()!!.split(" ").map { it.toInt() }
        list.add(Pair(start, end))
    }
    
    // 종료 시간 기준 정렬 후, 종료 시간이 같으면 시작 시간 기준으로 정렬
    list.sortWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })
    
    var lastEndTime = 0
    var count = 0
    
    // 그리디 방식으로 가능한 회의 선택
    for ((start, end) in list) {
        // 회의 시작 시간이 마지막 회의 종료 시간보다 크거나 같다면
        if (start >= lastEndTime) {
            count++           // 회의를 선택하고
            lastEndTime = end // 마지막 종료 시간을 업데이트
        }
    }

    println(count)
}

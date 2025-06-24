fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val str = readLine()!!
        println(nextPermutation(str) ?: "BIGGEST")
    }
}

fun nextPermutation(s: String): String? {
    val arr = s.toCharArray()
    var i = arr.size - 2

    // 1. 뒤에서부터 탐색하여 오름차순이 깨지는 지점(i) 찾기
    while (i >= 0 && arr[i] >= arr[i + 1]) {
        i--
    }

    // 이미 마지막 순열일 경우
    if (i < 0) return null

    // 2. i보다 큰 수 중 가장 작은 수(j)를 찾아 swap
    var j = arr.size - 1
    while (arr[i] >= arr[j]) {
        j--
    }
    arr[i] = arr[j].also { arr[j] = arr[i] }

    // 3. i 이후부터 끝까지 정렬 (오름차순)
    val subList = arr.sliceArray(i + 1 until arr.size).sorted().toCharArray()
    for (k in subList.indices) {
        arr[i + 1 + k] = subList[k]
    }

    return String(arr)
}

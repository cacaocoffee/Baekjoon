data class MapCell(
    var number: Int = 0,
    var visited: Boolean = false
)

fun main() {
    val n = readLine()!!.toInt()
    val grid = Array(n) {
        readLine()!!.map { MapCell(number = it.toString().toInt()) }.toTypedArray()
    }

    val houseCounts = mutableListOf<Int>() 
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!grid[i][j].visited && grid[i][j].number == 1) {
                houseCounts.add(dfs(grid, i, j, n))
            }
        }
    }


    println(houseCounts.size) 
    houseCounts.sorted().forEach{
        println(it)
    } 
}

fun dfs(grid: Array<Array<MapCell>>, row: Int, col: Int, size: Int):Int {
    if (row < 0 || row >= size || col < 0 || col >= size || grid[row][col].visited || grid[row][col].number == 0) {
        return 0
    }
    grid[row][col].visited = true
    var currentCount = 1 
    

    currentCount += dfs(grid, row - 1, col, size)
    currentCount += dfs(grid, row + 1, col, size)
    currentCount += dfs(grid, row, col - 1, size)
    currentCount += dfs(grid, row, col + 1, size)
    
    return currentCount
}
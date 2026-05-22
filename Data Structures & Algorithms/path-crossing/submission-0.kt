class Solution {
    fun isPathCrossing(path: String): Boolean {
        // trả true nếu mỗi ký tự đều di chuyển về 4 hướng Đông, Tây, Nam, Bắc
        // burted force (ở đây mình chạy hết chuỗi rồi mình sắp xếp vị trí của mỗi ký tự trong chuỗi theo 4 hướng)
        // sliding windows (?)

        val visited = HashSet<String>()
        var x = 0
        var y = 0

        visited.add("$x, $y")

        for (direction in path) {
            when (direction) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }

            val currentPos = "$x, $y"
            if (visited.contains(currentPos)) {
                return true
            }

            visited.add(currentPos)
        }

        return false
    }
}
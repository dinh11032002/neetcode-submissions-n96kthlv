class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val map = mapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in s) {
            if (char in map.keys) {
                if (stack.isNotEmpty() && stack.last() == map[char]) {
                    stack.removeAt(stack.size - 1)
                } else {
                    return false
                }
            } else {
                stack.add(char)
            }
        }


        return stack.isEmpty()
    }
}
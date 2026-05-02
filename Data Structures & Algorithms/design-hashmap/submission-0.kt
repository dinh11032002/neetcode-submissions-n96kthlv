class MyHashMap() {
    private val list = mutableListOf<Pair<Int, Int>>()
    fun put(key: Int, value: Int) {
        remove(key)
        list.add(key to value)
    }

    fun get(key: Int): Int {
        return list.find { it .first == key }?.second ?: -1
    }

    fun remove(key: Int) {
        list.removeIf { it.first == key }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */

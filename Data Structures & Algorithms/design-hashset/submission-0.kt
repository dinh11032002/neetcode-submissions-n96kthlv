class MyHashSet() {
    private val set = mutableListOf<Int>()
    fun add(key: Int) {
        if (!set.contains(key)) {
            set.add(key)
        }
    }

    fun remove(key: Int) {
        set.remove(key)
    }

    fun contains(key: Int): Boolean {
        return set.contains(key)
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */

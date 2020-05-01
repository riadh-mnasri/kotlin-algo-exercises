package com.riadh

class DuplicatesRemover {

    fun removeDuplicates(array: Array<Int>): Int {
        // 1, 1, 1, 1, 2
        if (array.isEmpty()) return 0
        val mutableArray = mutableListOf<Int>()
        var i = 0
        var j = 1
        while (j < array.size) {
            if (array[i] != array[j]) {
                mutableArray.add(array[i])
                mutableArray.add(array[j])
                i++
            }
            j++
        }
        return mutableArray.size
    }

    fun removeDuplicatesMoreThanTwice(sortedArray: Array<Int>): Int {
        // 1, 1, 1, 1, 2
        if (sortedArray.isEmpty()) return 0

        return sortedArray
            .groupBy { it }
            .values
            .asSequence()
            .map(this::truncate)
            .flatMap { it.asSequence() }
            .toList()
            .size
    }

    private fun truncate(list: List<Int>): List<Int> {
        return if (list.size < 2) list else list.subList(0, 2)
    }

}

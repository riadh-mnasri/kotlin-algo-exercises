package com.riadh

class RotateArray {
    fun rotate(list: List<Int>, n: Int): List<Int> {
        // 1, 2, 3, 4, 5, 6, 7

        // 7, 1, 2, 3, 4, 5, 6

        // 6, 7, 1, 2, 3, 4, 5

        // 5, 6, 7, 1, 2, 3, 4

        // 3
        // 5, 6, 7, 1, 2, 3, 4)
        var toshift = list.toMutableList()
        for (i in 1..n) {

            val shifted = toshift.shiftRight()
            toshift = shifted.toMutableList()

        }
        return toshift

    }

    fun <T> List<T>.shiftRight(): List<T> {
        if (this.isEmpty()) {
            return emptyList()
        }
        if(this.size == 1) {
            return this
        }
        val result = mutableListOf<T>()
        for (i in this.indices) {
            when (i) {
                0 -> result[0] = this[this.size - 1]
                this.size - 1 -> result[this.size - 1] = this[this.size - 2]
                else -> result[i + 1] = this[i]
            }
        }
        return result
    }


}

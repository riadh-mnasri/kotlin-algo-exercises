package com.riadh

class P09 {
    fun split(charsList: List<Char>): List<List<Char>> {
        return charsList.groupBy { it }.values.toList()
    }
}

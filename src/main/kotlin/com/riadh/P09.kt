package com.riadh

class P09 {
    //aaaabcc
    fun split(charsList: List<Char>): List<List<Char>> {
      return charsList.groupBy {c -> c}.values.toList()
    }

}

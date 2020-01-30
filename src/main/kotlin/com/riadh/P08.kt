package com.riadh

class P08 {

    fun removeConsecutiveDuplicates(list: List<Char>) =
        list.fold(emptyList<Char>()) { accumulator, value ->
            if (accumulator.isNotEmpty() && accumulator.last() == value) accumulator
            else accumulator + value
        }

}

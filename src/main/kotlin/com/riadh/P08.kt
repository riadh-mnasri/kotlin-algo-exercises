package com.riadh

import arrow.core.None
import arrow.core.Option
import arrow.core.some

class P08 {
    fun removeConsecutiveDuplicates(characters: CharArray): CharArray {
       val associated = characters.asSequence().associateWith { it }
        println(associated)
        return CharArray(10)
    }

}

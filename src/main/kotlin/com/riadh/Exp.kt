package com.riadh

fun main() {
    val ints = listOf(1, 3, 6, 5, 8)
    val result = ints.map{Math.pow(it.toDouble(), 2.0)}
    println(result)
}

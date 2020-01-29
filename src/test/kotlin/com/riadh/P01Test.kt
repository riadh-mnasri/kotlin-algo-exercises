package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class P01Test {
    @Test
    internal fun should_return_8_of_a_list_with_8_as_last_element() {
        // Given
        val ints = listOf(1, 1, 2, 3, 5, 8)

        val listProcessor = ListProcessor()

        // Then
        Assertions.assertThat(listProcessor.last(ints)).isEqualTo(8)
    }
}

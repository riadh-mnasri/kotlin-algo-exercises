package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RotateArrayTest {
    @Test
    internal fun should_rotate_array() {
        // Given
        val list = listOf(1, 2, 3, 4, 5, 6, 7)

        // When
        val result = RotateArray().rotate(list, 3)

        // Then
        Assertions.assertThat(result).isEqualTo(listOf(5, 6, 7, 1, 2, 3, 4))
    }
}

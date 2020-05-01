package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RemoveDuplicatesSortedArrayTest {

    @Test
    internal fun `should return size 2 from 11112 array`() {
        // Given
        val sortedArray = arrayOf(1, 1, 1, 1, 2)

        // When
        val result = DuplicatesRemover().removeDuplicates(sortedArray)

        // Then
        Assertions.assertThat(result).isEqualTo(2)

    }
}

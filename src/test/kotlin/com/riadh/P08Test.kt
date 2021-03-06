package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class P08Test {
    @Test
    internal fun should_return_characters_list_without_duplication() {
        // Given
        val text = "aaaabccaadeeee"

        // Then
        Assertions.assertThat(P08().removeConsecutiveDuplicates(text.toList())).isEqualTo(listOf('a', 'b', 'c', 'a', 'd', 'e'))
    }
}

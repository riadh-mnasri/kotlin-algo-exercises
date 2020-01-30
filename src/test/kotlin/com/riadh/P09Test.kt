package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class P09Test {

    @Test
    internal fun should_split_some_characters_in_separate_lists() {
        // Given
        val text = "aaaabcc"

        // When
        val result = P09().split(text.toList())

        // Then
        Assertions.assertThat(result).isEqualTo(listOf(listOf('a','a','a','a'), listOf('b'), listOf('c', 'c')))
    }
}

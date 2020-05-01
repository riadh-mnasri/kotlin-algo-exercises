package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MastermindTest {

    /*
    secret=ABCD, guess=ABCF
    Expected :Evaluation(rightPosition=3, wrongPosition=0)
    Actual   :Evaluation(rightPosition=3, wrongPosition=1)
     */
    @Test
    internal fun should_return_1_right_position_and_1_wrong_position_secret_ABCD_guess_ABCF() {
      // Given
        val mastermind = Mastermind()

        // when
        val evaluation = mastermind.evaluate("ABCF", "ABCD")

        //
        Assertions.assertThat(evaluation).isEqualTo(Evaluation(3, 1))
    }
}

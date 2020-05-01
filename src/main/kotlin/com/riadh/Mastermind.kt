package com.riadh

/*
guess=ADFE  secret=AABC,
java.lang.AssertionError: Wrong evaluation for secret=AABC, guess=ADFE
Expected :Evaluation(rightPosition=1, wrongPosition=0)
Actual   :Evaluation(rightPosition=1, wrongPosition=3)
 */
class Mastermind {
    fun evaluate(guess: String,  secret: String): Evaluation {
        val guessChars = guess.toList()
        val secretChars = secret.toList()
        guessChars.forEach {
            guess ->
        }

        /*guessChars.foldIndexed(0){
            index, acc, char -> if()

        }*/
        return Evaluation(0, 0)
    }

}

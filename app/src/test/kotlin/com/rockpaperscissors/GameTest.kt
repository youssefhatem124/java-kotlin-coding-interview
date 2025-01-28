package com.rockpaperscissors.game

import com.rockpaperscissors.Move
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameTest {

    private val game = Game()

    @Test
    fun testDetermineWinner() {
        assertEquals("DRAW", game.determineWinner(Move.ROCK, Move.ROCK))
        assertEquals("WIN", game.determineWinner(Move.ROCK, Move.SCISSORS))
        assertEquals("LOSE", game.determineWinner(Move.ROCK, Move.PAPER))
        assertEquals("WIN", game.determineWinner(Move.PAPER, Move.ROCK))
        assertEquals("DRAW", game.determineWinner(Move.PAPER, Move.PAPER))
        assertEquals("LOSE", game.determineWinner(Move.PAPER, Move.SCISSORS))
        assertEquals("WIN", game.determineWinner(Move.SCISSORS, Move.PAPER))
        assertEquals("LOSE", game.determineWinner(Move.SCISSORS, Move.ROCK))
        assertEquals("DRAW", game.determineWinner(Move.SCISSORS, Move.SCISSORS))
    }
}
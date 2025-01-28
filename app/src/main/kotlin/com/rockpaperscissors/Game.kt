package com.rockpaperscissors.game

import com.rockpaperscissors.Move
import com.rockpaperscissors.Player
class Game {
    fun playRounds(rounds: Int) {
        var playerAWins = 0
        var playerBWins = 0
        var draws = 0

        for (i in 1..rounds) {
            val playerA = Player(Move.ROCK)
            val playerB = Player(Move.values().random())

            when (determineWinner(playerA.move, playerB.move)) {
                "WIN" -> playerAWins++
                "LOSE" -> playerBWins++
                else -> draws++
            }
        }

        println("Player A wins $playerAWins of $rounds games")
        println("Player B wins $playerBWins of $rounds games")
        println("Draws: $draws of $rounds games")
    }

    /**
     * Determines the winner based on the moves of two players.
     * @param moveA Move of player A.
     * @param moveB Move of player B.
     * @return "WIN" if player A wins, "LOSE" if player A loses, "DRAW" if it's a tie.
     */
    internal fun determineWinner(moveA: Move, moveB: Move): String {
        return when {
            moveA == moveB -> "DRAW"
            (moveA == Move.ROCK && moveB == Move.SCISSORS) ||
                    (moveA == Move.PAPER && moveB == Move.ROCK) ||
                    (moveA == Move.SCISSORS && moveB == Move.PAPER) -> "WIN"
            else -> "LOSE"
        }
    }
}
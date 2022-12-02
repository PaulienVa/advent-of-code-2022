#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec2

import java.io.File


// Rock defeats Scissors,
// Scissors defeats Paper,
// and Paper defeats Rock

// A for Rock, B for Paper, and C for Scissors
// X for Rock, Y for Paper, and Z for Scissors

// 1 for Rock, 2 for Paper, and 3 for Scissors
// plus the score for the outcome of the round
// 0 if you lost, 3 if the round was a draw, and 6 if you won

// Score outcome:
// losing combinations
// A > Z : 0
// C > Y : 0
// B > X : 0
// winning combinations
// C < X : 6
// B < Z : 6
// A < Y : 6
// draw combinations:
// A == X : 3
// B == Y : 3
// C == Z : 3

// Part 2:
// X means you need to lose,
// Y means you need to end the round in a draw,
// Z means you need to win
//

val strategy = File("./input.txt").inputStream().bufferedReader().readLines()

println("Solution to part 1:")

val combinations = strategy.map { it.split(" ") }

val scores1 = combinations.map { it.calculateScore() }

println("${scores1.sum()}")

println("Found")


println("Solution to part 2:")
val scores2 = combinations.map { it.calculateScore2() }

println("${scores2.sum()}")
println("Found")

fun List<String>.calculateScore2() : Int  {
    // Score outcome:
// losing combinations
// A > Z : 0
// C > Y : 0
// B > X : 0
// winning combinations
// C < X : 6
// B < Z : 6
// A < Y : 6
// draw combinations:
// A == X : 3
// B == Y : 3
// C == Z : 3

//        "Rock "    1
//        "Paper "   2
//        "Scissor"  3

    val outcomeScore = when(this[1]) {
        "X" -> 0
        "Y" -> 3
        "Z" -> 6
        else -> 0
    }

    val chosenScore = if (this[0] == "A") { // ROCK
        if(this[1] == "Z") { // winning
            2 // Paper
        } else if (this[1] == "Y") {  // draw
            1 // Rock
        } else { // losing
            3 // Scissors
        }
    } else if (this[0] == "B") { // PAPER
        if(this[1] == "Z") { // winning
            3 // Scissors
        } else if (this[1] == "Y") {  // draw
            2 // Paper
        } else { // losing
            1 // Rock
        }
    } else if (this[0] == "C") { // SCISSOR
        if(this[1] == "Z") { // winning
            1 // Rock
        } else if (this[1] == "Y") {  // draw
            3  // Scissor
        } else { // losing
            2 // Paper
        }
    } else {
        0
    }

    return chosenScore + outcomeScore
}
fun List<String>.calculateScore(): Int {
    val chosenScore = when(this[1]) {
        "X" -> 1
        "Y" -> 2
        "Z" -> 3
        else -> 0
    }

    val outcomeScore = if (this[0] == "A") {
        if(this[1] == "Y") {
            6
        } else if (this[1] == "X") {
            3
        } else {
            0
        }
    } else if (this[0] == "B") {
        if (this[1] == "Z") {
            6
        } else if (this[1] == "Y") {
            3
        } else {
            0
        }
    } else if (this[0] == "C"){
        if (this[1] == "X") {
            6
        } else if (this[1] == "Z") {
            3
        } else {
            0
        }
    } else {
        0
    }

    return chosenScore + outcomeScore
}



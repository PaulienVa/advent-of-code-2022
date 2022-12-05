#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec4

import java.io.File
import java.util.*

val stackNumbersLine = 9

val input = File("./input.txt").inputStream().bufferedReader()
    .readLines()

val startingSituationInput = input.subList(0, stackNumbersLine)

val movesInput = input.subList(stackNumbersLine + 1, input.size)

val startingConfigurationSize = startingSituationInput
    .last()
    .split(" ")
    .filter { it.isNotBlank() }
    .size

val startingConfiguration = (1..startingConfigurationSize).map { Stack<String>() }
startingSituationInput.subList(0, stackNumbersLine - 1)
    .reversed()
    .map { it.replace("   ", "[ ]").split("] [").map { cel -> cel.replace("[", "").replace("]", "")  } }
    .forEach { it.forEachIndexed {index, crate -> if (crate.isNotBlank()) startingConfiguration[index].push(crate) } }

val moves = Stack<Move>()
movesInput
    .map { Move.fromString(it) }
    .reversed()
    .forEach { moves.push(it) }

applyMoves(moves, startingConfiguration)

val topOnes = startingConfiguration.map { it.pop() }

println("Solution to part 1:")

println("Found ${topOnes.joinToString("")}")


println("Solution to part 2:")

println("Found")

fun applyMoves(moves: Stack<Move>, startingConfiguration: List<Stack<String>>) : List<Stack<String>> {
    if (moves.isEmpty()) {
        return startingConfiguration
    }
    val move = moves.pop()
    val newStartingConfiguration = move.applyMove(startingConfiguration)
    return applyMoves(moves, newStartingConfiguration)
}

data class Move (val nrMoves: Int, val fromStack: Int, val toStack: Int) {
    companion object {
        fun fromString(string: String) : Move {
            val configs = string.split(" ").filter { it.filter { bla -> bla.isDigit() }.isNotBlank() }

            return Move(configs[0].toInt(),
                configs[1].toInt(), configs[2].toInt())
        }
    }

    fun applyMove(stacks: List<Stack<String>>) : List<Stack<String>> {
        (0 until nrMoves).forEach { _ ->
            val crate = stacks[fromStack - 1].pop()
           stacks[toStack - 1].push(crate)
        }
        return stacks
    }
}

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

val startingConfiguration1 = (1..startingConfigurationSize).map { Stack<String>() }
val startingConfiguration2 =(1 .. startingConfigurationSize).map { mutableListOf<String>() }.toMutableList()
val startingSituationBase = startingSituationInput.subList(0, stackNumbersLine - 1)
    .reversed()
    .map { it.replace("   ", "[ ]").split("] [").map { cel -> cel.replace("[", "").replace("]", "")  } }

startingSituationBase.forEach { it.forEachIndexed {index, crate -> if (crate.isNotBlank()) startingConfiguration1[index].push(crate) } }
startingSituationBase.forEach { it.forEachIndexed {index, crate -> if (crate.isNotBlank()) startingConfiguration2[index].add(crate) } }

val moves = Stack<Move>()
movesInput
    .map { Move.fromString(it) }
    .reversed()
    .forEach { moves.push(it) }


println("Solution to part 1:")

//applyMoves(moves, startingConfiguration1)
//
//val topOnes = startingConfiguration1.map { it.pop() }
//
//println("Found ${topOnes.joinToString("")}")


println("Solution to part 2:")

applyMoves2(moves, startingConfiguration2)
val topOnes2 = startingConfiguration2.map { it.lastOrNull() }.filterNotNull()

println("Found ${topOnes2.joinToString("")}")

fun applyMoves2(moves: Stack<Move>, startingConfiguration: MutableList<MutableList<String>>) : MutableList<MutableList<String>> {
    if (moves.isEmpty()) {
        return startingConfiguration
    }
    val move = moves.pop()
    val newStartingConfiguration = move.applyMove2(startingConfiguration)
    return applyMoves2(moves, newStartingConfiguration)
}


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

    fun applyMove2(stacks: MutableList<MutableList<String>>) : MutableList<MutableList<String>> {
        val fromStackSize  = stacks[fromStack - 1].size
        val  toMove = if ( fromStackSize - nrMoves > 0 ) fromStackSize - nrMoves else 0
        val moveSub  = stacks[fromStack - 1].subList(toMove, fromStackSize)
        stacks[fromStack - 1] = stacks[fromStack - 1].subList(0, toMove)
        stacks[toStack - 1] = (stacks[toStack - 1] + moveSub) as MutableList<String>
        return stacks
    }
}

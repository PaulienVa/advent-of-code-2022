#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec3

import java.io.File

val input = File("./input.txt").inputStream().bufferedReader().readLines()

println("Solution to part 1:")

println("a: ${'a'.convertToPriority()}")
println("A: ${'A'.convertToPriority()}")

val sumPriorities = input
    .map { it.substring(0, it.length / 2) to it.substring(it.length / 2) }
    .map { it.commonChar() }.sumOf { it.convertToPriority() }

println("Found: ${sumPriorities}")


println("Solution to part 2:")

println("Found")

fun Pair<String, String>.commonChar(): Char = this.first.first { it in this.second }
fun Char.convertToPriority(): Int {
    return if (this.isLowerCase()) {
        this.code - 96
    } else {
        this.code - 38
    }
}

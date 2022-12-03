#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec3

import java.io.File

val input = File("./input.txt").inputStream().bufferedReader().readLines()

println("Solution to part 1:")

val sumPriorities1 = input
    .map { it.substring(0, it.length / 2) to it.substring(it.length / 2) }
    .map { it.commonChar() }.sumOf { it.convertToPriority() }

println("Found: ${sumPriorities1}")


println("Solution to part 2:")

val sumPriorities2 = input
    .chunked(3)
    .map { it.commonChar() }
    .sumOf { it.convertToPriority() }

println("Found: ${sumPriorities2}")

fun Pair<String, String>.commonChar(): Char = this.first.first { it in this.second }

fun List<String>.commonChar(): Char = this.findCommonChar()


fun List<String>.findCommonChar(): Char {
    return this.map { it.toSet() }.reduce(Set<Char>::intersect).first()
}

fun Char.convertToPriority(): Int {
    return if (this.isLowerCase()) {
        this.code - 96
    } else {
        this.code - 38
    }
}

#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec4

import java.io.File

val input = File("./input.txt").inputStream().bufferedReader().readLines()

println("Solution to part 1:")

val fullyOverlappingPairs = input
    .map { it.split(",") }
    .map { it[0] to it[1] }
    .map { it.first.toRange() to it.second.toRange() }
    .count { it.first.containsAll(it.second) ||  it.second.containsAll(it.first) }

println("Found ${fullyOverlappingPairs}")


println("Solution to part 2:")

println("Found")


fun String.toRange(): Set<Int> {
    val extractedBoundaries = this.split("-")
    val range = extractedBoundaries[0].toInt() .. extractedBoundaries[1].toInt()
    return range.toSet()
}

#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec1

import nl.paulienvanalst.adventOfCode.twentytwentytwo.utils.Utils

val input = Utils.readFileAsWhole()

println("Solution to part 1:")
val portionPerElf = input.split("\n\n")
val portions = portionPerElf.map { portions -> portions.split("\n") }
val sumPortions = portions
    .map { portions -> portions.filter { it.isNotBlank() }
    .sumOf { it.toInt() }  }
    .sortedDescending()

val maxPortion = sumPortions[0]
println("Found: $maxPortion")

println("Solution to part 2")
val sumTopThree = sumPortions.subList(0, 3).sum()

println("Found: $sumTopThree")

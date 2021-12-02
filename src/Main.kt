import days.*
import java.lang.Exception
import java.util.*

fun main () {
    while (true) {
        try {
            // Get user input
            val reader = Scanner(System.`in`)
            print("\nDay to run (0 to quit): ")

            // Run code for day
            when (reader.nextInt()) {
                0 -> {
                    println("Quitting...")
                    break
                }
                1 -> Day01().solveAll()
                2 -> Day02().solveAll()
                3 -> Day03().solveAll()
                4 -> Day04().solveAll()
                5 -> Day05().solveAll()
                6 -> Day06().solveAll()
                7 -> Day07().solveAll()
                8 -> Day08().solveAll()
                9 -> Day09().solveAll()
                10 -> Day10().solveAll()
                11 -> Day11().solveAll()
                12 -> Day12().solveAll()
                13 -> Day13().solveAll()
                14 -> Day14().solveAll()
                15 -> Day15().solveAll()
                16 -> Day16().solveAll()
                17 -> Day17().solveAll()
                18 -> Day18().solveAll()
                19 -> Day19().solveAll()
                20 -> Day20().solveAll()
                21 -> Day21().solveAll()
                22 -> Day22().solveAll()
                23 -> Day23().solveAll()
                24 -> Day24().solveAll()
                else -> println("Error: Day not found")
            }
        } catch (ex: InputMismatchException) {
            println("Error: Invalid input")
        }
        catch (ex: Exception) {
            println("Error: $ex")
        }
    }
}

# Advent of Code Template
A Kotlin template for [Advent of Code](https://adventofcode.com/), complete with a CLI.

## Table of Contents
1. [How To Run](#How-To-Run)
2. [Util Functions](#Util-Functions)

### How To Run
1. Fork this repository
2. Clone the forked repository to your local machine
3. Create a new configuration in IntelliJ IDEA and set `MainKt` as the main class 
   - You may need to download any missing dependencies like OpenJDK or Kotlin, but IntelliJ IDEA will help you with this
4. For each day, write your solution in the respective class in the `src/days` folder
5. Run your project and have fun!

### Util Functions
The `src/Utils.kt` file contains some helpful methods from [JetBrains](https://www.jetbrains.com/) that you can use in your solutions.

- The `readFile(name: String)` function takes in a file name and returns a List<String>. For example:
    ```
    var count = 0
    val input = readFile("Day01").map { it.toInt() }
    for (i in 1 until input.size) {
        if (input[i] > input[i-1]) {
            count++
        }
    }
    ```
- The `String.md5()` function is an extension method on the String class that transforms a string into a md5 hash. For example:
  ```
  if ("This is a test string".md5() == "c639efc1e98762233743a75e7798dd9c") {
          // This is true
  }
  ```

fun main() {
    // Get input year
    print("Enter the year you want to check: ")
    val year = readLine()?.toInt() ?: 0

    // Check if the year is a leap year
    val isLeapYear = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        true
    } else {
        false
    }

    // Print the result
    println("$year is ${if (isLeapYear) "a leap year!" else "not a leap year\uD83D\uDE22"}")
}
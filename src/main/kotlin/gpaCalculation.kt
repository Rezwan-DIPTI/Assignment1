fun main() {
    // Define the list of subjects and their corresponding grades
    val subjects = listOf("Bengali", "Math", "Science", "English", "History")
    val grades = listOf(84, 98, 96, 90, 74)

    // Calculate the total number of grade points
    var totalGradePoints = 0.0
    for (grade in grades) {
        if (grade >= 80) {
            totalGradePoints += 5.0
        } else if (grade >= 70) {
            totalGradePoints += 4.0
        } else if (grade >= 60) {
            totalGradePoints += 3.5
        } else if (grade >= 50) {
            totalGradePoints += 3.0
        } else if (grade >= 40) {
            totalGradePoints += 2.0
        } else if (grade >= 33) {
            totalGradePoints += 1.0
        } else {
            totalGradePoints += 0.0
        }
    }

    // Calculate the GPA
    val gpa = totalGradePoints / subjects.size

    // Print the GPA
    println("Your GPA is: $gpa")
}
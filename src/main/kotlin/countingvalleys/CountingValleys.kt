package countingvalleys

fun main(vararg args: String) {
    println(countingValleys(8, "UDDDUDUU"))
}

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here

    var count = 0
    var journey = 0
    path.forEach { path ->

        if (path == 'D') {
            journey += 1
        } else if (path == 'U') {
            journey--
            if (journey == 0) {
                count++
            }
        }

    }

    return count
}

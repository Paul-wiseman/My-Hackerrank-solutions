package pickingNumbers

fun main() {

    val a = arrayOf(
        4,
        97,
        5,
        97,
        97,
        4,
        97,
        4,
        97,
        97,
        97,
        97,
        4,
        4,
        5,
        5,
        97,
        5,
        97,
        99,
        4,
        97,
        5,
        97,
        97,
        97,
        5,
        5,
        97,
        4,
        5,
        97,
        97,
        5,
        97,
        4,
        97,
        5,
        4,
        4,
        97,
        5,
        5,
        5,
        4,
        97,
        97,
        4,
        97,
        5,
        4,
        4,
        97,
        97,
        97,
        5,
        5,
        97,
        4,
        97,
        97,
        5,
        4,
        97,
        97,
        4,
        97,
        97,
        97,
        5,
        4,
        4,
        97,
        4,
        4,
        97,
        5,
        97,
        97,
        97,
        97,
        4,
        97,
        5,
        97,
        5,
        4,
        97,
        4,
        5,
        97,
        97,
        5,
        97,
        5,
        97,
        5,
        97,
        97,
        97
    )
// 1,3,,3,4,5,6
    println(split(a))
    println(pickingNumbers(a))
}

fun split(a: Array<Int>) {

    println(a.sorted().groupBy { it }.values.toList())

}

fun pickingNumbers(a: Array<Int>): Int {

    val group = a.sorted().groupBy { it }.values.toList()
    var maxCount = 0
    for (i in 1 until group.size) {
        maxCount =  Math.max(maxCount, group[i].size)
        var first = group[i - 1]
        var second = group[i]
        if (Math.abs(first[0] - second[0]) <= 1) {
            println("first size: ${first.size}")
            println("second size: ${second.size}")
            maxCount = Math.max(maxCount, (first.size + second.size))
        }
    }
    return maxCount
}

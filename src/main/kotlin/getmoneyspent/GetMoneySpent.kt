package getmoneyspent

fun main(vararg args:String){

    println(getMoneySpent(arrayOf(3, 1), arrayOf(5, 2, 8), 10))
}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */
    val sortedKeyboards = keyboards.sorted()
    val sortedDrives = drives.sorted()
    var combinedPrice = mutableListOf<Int>()

    for (i in sortedKeyboards.indices){
        for(j in sortedDrives.indices){
            if(sortedKeyboards[i] < b){
                if(sortedKeyboards[i] + sortedDrives[j] <= b){
                    combinedPrice.add(sortedKeyboards[i] + sortedDrives[j])
                }
            }
        }

    }

    return combinedPrice.maxOrNull() ?:-1




}

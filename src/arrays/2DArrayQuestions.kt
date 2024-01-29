package arrays

fun array2D(rows: Int, columns: Int) {
    val twoDArray = Array(rows) { Array(columns) { i -> i * 1 } }
    println(twoDArray.contentDeepToString())

    for (i in 0..<rows) {
        for (j in 0..<columns) {
            print(twoDArray[i][j], )
        }
    }
}
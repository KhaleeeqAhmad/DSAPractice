package arrays


/*
* search a number from matrix
*/

fun searchNumberFrom2DArray(rows: Int, columns: Int, number: Int) {

    val twoDArray = Array(rows) { Array(columns) {i -> rows * i + columns } }


    for (i in 0..<rows) {
        for (j in 0..<columns) {
            if (twoDArray[i][j] == number) {
                println("[$i, $j]")
            }
        }
    }

}



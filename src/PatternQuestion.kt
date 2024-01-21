
fun solidRectangle(numberOfRows: Int, numberOfColumns: Int) {

    for (i in 0..numberOfRows) {
        for (j in 0..numberOfColumns) {
            print("*")
        }
        println()
    }

}


fun hollowRectangle() {
    val n = 4
    val m = 5
    for (i in 1..n) {
        for (j in 1..m) {
            if (i == 1 || j==1 || i==n || j == m) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}


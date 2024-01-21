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
            if (i == 1 || j == 1 || i == n || j == m) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun halfPyramid() {
    val n = 4

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun invertedHalfPyramid() {
    val n = 4
    for (i in n downTo 1){
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun invertedHalfPyramid180() {
    val n = 4
    for (i in n downTo 1) {
        for (j in 1..n) {
            if (i<=j) {
                print("*")
            }else
                print(" ")
        }
        println()
    }
}

fun halfPyramidWithNumbers() {
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}

fun invertedHalfPyramidWithNumbers() {
    val n = 5
    for (i in n downTo 1) {
        for (j in 1..i){
            print(j)
        }
        println()
    }

}


fun floydTriangle() {
    val n = 5
    var incrementedNumber = 1
    for (i in 1..n) {
        for (j in 1..i) {
            print("$incrementedNumber ")
            incrementedNumber++
        }
        println()
    }
}

fun triangle01() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..i) {
            val sum =i+j
            if (sum % 2 ==0) {
                print("1 ")
            } else {
                print("0 ")
            }
        }
        println()
    }
}
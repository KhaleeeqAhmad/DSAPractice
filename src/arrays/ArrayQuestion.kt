package arrays

fun searchNumberFromArray(array: IntArray, number: Int) {

    if (array.isEmpty()) {
        return
    }

    for (i in array.indices) {
        if (array[i] == number) {
            println(i)
        }
    }
}
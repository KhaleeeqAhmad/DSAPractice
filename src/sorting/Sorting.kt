package sorting

fun bubbleSort(array: IntArray) {

/**
 * Time Complexity = 0(n^2)
 * */
    for (i in array.indices){
        for (j in 0..<array.size-i-1) {
            if (array[j] > array[j+1]) {
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }

    for (i in array.indices) {
        print("${array[i]},")
    }
}
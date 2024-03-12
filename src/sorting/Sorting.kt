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

fun selectionSort(array: IntArray){

    /**
     * Time Complexity = 0(n^2)
     * */

    for (i in array.indices) {
        var smallest = i
        for (j in i+1..<array.size) {
            if (array[smallest] > array[j]) {
                smallest = j
            }
        }
        val temp = array[smallest]
        array[smallest] = array[i]
        array[i] = temp
    }

    for (i in array.indices) {
        print("${array[i]},")
    }
}
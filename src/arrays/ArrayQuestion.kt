package arrays

import javax.management.openmbean.ArrayType
import kotlin.math.max
import kotlin.math.min

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

/*
* Find the maximum & minimum number in an array of integers.
* */

fun maxMinNumberInArray(array: IntArray) {

    if (array.isEmpty()) {
        println("Given Array is empty")
        return
    }

    var minNumberInArray = array[0]
    var maxNumberInArray = array[0]

    for (i in array.indices) {
        if (maxNumberInArray < array[i]) {
            maxNumberInArray = array[i]
        }

        if (minNumberInArray > array[i]) {
            minNumberInArray = array[i]
        }
    }

    println("Min Number is $minNumberInArray and Max Number is $maxNumberInArray")
}
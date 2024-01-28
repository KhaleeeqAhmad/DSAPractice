package basic_questions

/*
*    Enter 3 numbers from the user & make a function to print their average.
* */


fun avgOfNumbers(a: Int, b: Int, c: Int) {
    val avg = (a+b+c)/3
    println("Average: $avg")
}

/*
*Write a function to print the sum of all odd numbers from 1 to n.
* */

fun sumOfOddNumbers(n: Int) {
    var sum = 0
    for(i in 1..n) {
        if (i%2!=0) {
            sum += i
        }
    }
    println("Sum: $sum")
}

/*
Write a function which takes in 2 numbers and returns the greater of those two.
*/

fun greaterNumber(a: Int, b: Int) {
    when{
        a>b -> println("$a is Greater")
        b>a -> println("$b is Greater")
        else -> println("$a and $b both are equal Numbers!")
    }
}

/*
*Write a function that takes in the radius as input and returns the circumference of a circle.
* */


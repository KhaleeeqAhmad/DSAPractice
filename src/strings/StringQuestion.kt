package strings

fun printString(text: String) {

    for (i in text.length-1 downTo 0) {
        print(text[i])
    }

}
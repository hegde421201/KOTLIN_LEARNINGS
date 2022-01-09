package basics

fun main(){

   var sum = 0
    rowLoop@ for (row in 0 until 3) {
        columnLoop@ for (column in 0 until 3) {
            if (row == column) {
                continue@rowLoop
            }
            sum += row * column
        }
    }

    println(sum)

    //WHEN EXPRESSIONS
    var number = 3
    val game = when(number){

        in 0..2 -> "Zero"
        number % 3  -> "One"
        else -> "Nothing"

    }
    println(game)

    printMultiple(6)

}

fun printMultiple(value:Int){
    println("$value * 6 = ${value * 6}")
}
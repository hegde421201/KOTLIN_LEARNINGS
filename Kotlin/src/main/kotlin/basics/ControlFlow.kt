package basics

fun main(){

    //RANGES
    val closedRange = 0..5 //inclusive range 0,1,2,3,4,5 ----->  CLOSED RANGE

    //half-open range
    val halfOpenRange = 0 until 5 // 0,1,2,3,4

    //decreasing range
    val decreasingRange = 5 downTo 0 //5,4,3,2,1,0


    for(i in 1..10)
    {
        print(i)
    }

    var sum = 0;
    println()
    repeat(10){
        sum+=19
    }

    for(j in 1..10 step 2)
    {
        print("$j \t")
    }
    println()
    //println(sum)
    var tt = 99
    println(++tt)

    var count = 15
    for (j in count downTo 1 step 3)
        print("$j \t")

}
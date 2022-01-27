package part2

import java.util.*

fun main(){

    val numbersArray = arrayOf(1,2,3,4) //Array<Int>

    val second = intArrayOf(1,4,6,8)

    val antuArrays = Array(6,{3}) //6,6,6,6,6,6
    println(antuArrays.contentDeepToString())

    val y  = numbersArray.toIntArray() //IntArray or int[]

    y.forEach { println(it) } //iterating over an array

    //creating lists
    //List<String> or ArrayList of strings ----- immutable
    val months = listOf("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep")

    //mutable list
    var  mm = arrayListOf("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep")
    var yy : MutableList<String> = mm

    println(mm.joinToString())
    mm.remove("Feb")
    println(mm)
    println("TTT" in mm)

}
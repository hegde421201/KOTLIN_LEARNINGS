package basics

import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin

fun main(){

    println("Hello world")

    //single line comment

    /*
    *
    * multi line comments
    * */

    /*
     /**/ NESTED COMMENT

    * */

    /*


3) Arithmetic operators
-----------------------------
a) Math operators and expressions
b) Decimals and integers
c) Modulo operator
d) format specifier
e) Operator precedence

    * */

    /*
      println(sin(PI/3))
    println(22 + 5)
    println(33 -1 )
    println(11 / 2) //Integer division
    println(11.0 / 2) //decimal division
    println(11 % 2) //modulus
    println(11 * 2 + 5)  //precedence in expressions BODMAS

 //FORMAT SPECIFIER
    println("%.4f".format(22/3.0))
    //radius = 5

    println("The area of circle is "+PI*2*5*5)

    println(max(11,3))
    println(min(11,7))

    */

    var antariksha = "boy"
    var antu  = "pune"

    println(antu)

    var antu1  = 6
    var govind = 20.33
    var ganesh = 20.44F

    println(antu1 + govind + ganesh)

   val girish = 7

   var antariksha_Manjule = 7

    antariksha = "mumbai"

    var  abc = 10
    abc++
    println(abc)
    abc--
    println(abc)

    abc += 10
    println(abc)

    println(abc.toDouble())

    var t = 19.666535
    println(t.toInt())

    println(t + abc)

    //STRING template

  //  println("The value of $t is very nice")
  //  println("The value of ${t * 4} is very very nice")
  //  println("$t $abc")
  //  println("${t + abc}")

    var newType = Pair(12,14) //Pair variable
    println(newType.first)
    println(newType.second)

    var yahoo = Triple(10,13,14) //Triple variable
    println(yahoo.first)
    println(yahoo.second)
    println(yahoo.third)

    var (rathod,x5,_) = yahoo
    println("$rathod $x5")

}
import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.reflect.typeOf

fun main(){
    println("Hello Govind")

    //Single-line comments

    /*
    *
    * MULTI LINE  COMMENTS
    *
    * */

    /*
     /*

    This is a nested comment. println() outputs to the console.
      */
     */

    println(3*5)
    println(22.0 % 7)
    println("%.2f".format(26.0 % 7)) //format specifier

    //math operators
    println("%.2f".format(sqrt(12.4)))
    println(sin(35* PI/100)) //PI is a constant provided by KOTLIN
    println(sin(PI/4))
    println(sqrt(1/2.0))
    println(Math.max(10L,13))

    //Naming
    //constant
    val a : Int = 10
    val b = 10
    println(a + b)

    var d : Double = 10.0
    var f : Float = 6f
    var s: String = "Program"
    println(s)
    println(d + f)

    var t = 10_000_111_555_77777_888
    println(t)

    d+=1
    println(d)

}
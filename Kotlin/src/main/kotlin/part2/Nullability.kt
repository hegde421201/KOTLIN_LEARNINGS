package part2

fun main(){

var name = "Govardhan Pandey"
var age = 45
var occupation = "Software engineer"


var names : String? = "Antariksha"
    names = "" //empty string ---0 characters


    names = null //absence of value


//a valid value that represents a special condition such as the absence of a value is called sentinel value.
//null means absence of value

//A non-nullable Integer can be defined as follows:
    var value : Int = 6 //value is a non-nullable integer guaranteed to have a value

    var count: Int? = null //nullable integer -- either holds null or integers

    //The count variable above is like a box with no value or integer value
    //When we assign an integer to the box then we are filling it. When we are removing the integer we are emptying the box

    count = null

    var gov : String? = "66"

    var antu : Int? = 10 //nullable integer

    println(antu?.plus(1))






    println(gov?.length?.plus(6))
    println()

    gov.let {
        println(it?.length)
        var ty = gov?.length
        println(ty)
    }

}


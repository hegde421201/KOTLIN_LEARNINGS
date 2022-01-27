package part2

fun main(){

    var antu : Int? = null //nullable integer -- sentinel value



    //nullability
//    println(antu?.plus(1)) //safe call ?.


  //  println(antu?.times(12))

    if(antu !=null) //smart cast
        antu++
    else
        println("Antu is null")


    var authorName : String? = null
   // println(authorName?.length)

    //let function can be used on safe call operator

    authorName?.let {
        println("$authorName")
        println("${authorName.length}")
    }

    var b = "sri"



    //avoid !!----
    //println(antu!! + 1) //not-null assertion operator---antu will always have non-null values or integers

}
package basics

fun main(){

    //Type conversion
    var a = 12
    var b = 15.099

   var c = a.toDouble()
   println(c)

   var d = b.toInt()
   println(d) //loss of precision --- all type conversions are explicit

   //operators with mixed types
   val e = d * c
   println(e)

    //string template
   var message = "Govind is $e"
    println(message)

   var catalog = "Message ${e*4}"
    println(catalog)

    //Multi-line strings
    //--------------------

    val bigString = """
        |You can have a string 
        |that contains multiple 
        |lines
        |by
        |doing this. """.trimMargin()

    println(bigString)

    //Pair
    var coordinates :Pair<Double,Double> = Pair(21.5353,62.24224)

    //Triple
    var yahoo : Triple<Int,String,Double> = Triple(2,"ABC",3.77)

    println("$yahoo $coordinates $e")

    var a1 = yahoo.first
    var a2 = yahoo.second
    var a3 = yahoo.third

    println("$a1 $a2 $a3")

    //ignore
    val (x4,x5,_) = yahoo
    println("$x4 $x5")

    add()
    val w : Any = 55
    println(w)

   //ANY ====> OBJECT
   //UNIT =====> void


}

fun add() : Unit {
    val a = 2 + 2
    println(a)
}

fun not() : Nothing{

   while(true){}
}
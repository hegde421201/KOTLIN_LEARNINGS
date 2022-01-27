package part2

fun main(){

  /*  val govind  = Array(5, {null})
    println(govind.contentDeepToString())
*/
    val vowels = arrayOf("Antu","Bantu","Chantu","D","E")
   // println(vowels.contentDeepToString())


    val gg = arrayOf(1,6,null) //nullable array of int

    //define govind variable val of size 5 whose default value is 0 --- integer array
  // println(gg[2]?.plus(3))



    val kk = arrayOf(1,"ww",3,null) //Any ----define ---compile time
    kk[1] = 66



    println(kk.contentDeepToString())

  //  println(kk::class.java) //Integer[] --- java

    kk.forEach {
        //println(it)
    }


//    val mm = arrayOf(1,2,3,4).toIntArray()
 //   println(mm::class.java) //int[] --- java


//NO CHANGE
    var ff = listOf("Abu","Meme","Zaba") //immutable list --- LIST
    var zz = mutableListOf<String>() //Immutable list

    println(zz)

    zz.add("Manjule")
    zz.add("Govind")
    zz.add("Patel")
    println(zz)

    zz.remove("Patel")
    var xx = arrayListOf<String>()
    xx.addAll(zz)

    if(zz.size < 4)
        println("Holiday tomorrow")
    else
        println("Leave")

    println(zz.last())

    println(zz.lastIndexOf("Govind"))

    zz = mutableListOf("AA","BB","CC","DD","EE","FF")
    println(zz.slice(1..3))
    println(zz.slice(1..3).joinToString())

    var nullableList : ArrayList<Int?> = arrayListOf(21,33,null)
    nullableList[2]?.plus(2)


    println(nullableList)


}
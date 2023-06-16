package reactive

fun main(){

    var lists = listOf<Any>("One",1,"Two",2.0,true,5.0f)
    var iterator = lists.iterator()

    while(iterator.hasNext()){

        println(iterator.next())
    }

}
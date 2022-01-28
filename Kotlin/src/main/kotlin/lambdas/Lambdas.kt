package lambdas

fun main(){

    //lambda declaration
    var multiplyLambda : (Int,Int) -> Int

    //lambda assigning to a variable
    var multLambda1 = {a : Int, b: Int -> Int
        a * b}

    val lambdaResult = multLambda1(4,2)
    //println(lambdaResult)

    var shortSyntaxLambda =  {a : Int, b : Int -> a * b}
    //println(shortSyntaxLambda(10,20))

    val greetings = { println("Hi manjule")}
    //greetings()

    var doubleLambda = {a:Int -> 2 * a}
  //  println(doubleLambda(5))
   doubleLambda = {2 * it }
   // println(doubleLambda(8))

    val addLambda = {a : Int, b : Int -> a + b}

    //operateNumbers(4,2, addLambda)
   // operateNumbers(10,20,multLambda1)

   // operateNumbers(b = 16, operationLambda = shortSyntaxLambda,a = 12)
   // operateNumbers(a = 20, operationLambda = ::divFunction,b = 10)


    val names = arrayOf("Zebra","Crocodil","Ant","Bull","Elephant")
    names.sorted() //new list created
 //   println(names.contentDeepToString()) //original list not changed


    val namesByLength = names.sortedWith(compareByDescending {it})
  //  println(namesByLength)


   // namesByLength.forEach { println(it.length) }

    val prices = listOf(1.3,4.5,23.55,12.4,8.6)

    val largePrices = prices.filter { it > 5.0 }
    val smallerPrices = prices.filter { it < 6.0 }
   // println(largePrices)
   // println(smallerPrices)


    val salesPrices = prices.map {it * 0.9} //90% of actual price will be new sales price
   // println(salesPrices)

    val userInputs = listOf("6","11","govind","14")
   // val numbersOnly = userInputs.map { it.toIntOrNull() }
    val numbersOnlyWithoutNull = userInputs.mapNotNull { it.toIntOrNull() }

   // println(numbersOnly)
  //  println(numbersOnlyWithoutNull)

    //[6, 11, 14] = numbersOnlyWithoutNull


    var sum = numbersOnlyWithoutNull.fold(0) {a,b -> a + b}

    var factorial = (1..6).fold(1) {x,y -> x * y}
    println(factorial)
    //println(sum)
    println(factorial(6))

    val namesAndAges = mapOf(Pair("Antu",18),Pair("Govind",32),Pair("Patel",28),Pair("Hegde",39))
    //people who are under 30

    println(namesAndAges.filter { it.key == "Antu" })



}

fun testing(){

    println("Please enter the integer whose factorial is required")
    var number = readLine()?:"0"
    var fact = -1.0
    var userInput = 0

    try{
        userInput = number.toInt()

    }catch (e:Exception){
        userInput = Int.MIN_VALUE
    }finally {

        println("The factorial of $userInput is ${basics.factorial(userInput)}")
    }



}


fun factorial(n : Int) = (1..n).fold(1){x,y -> x * y}



fun divFunction(a3:Int,b3:Int) = a3 / b3


//anonymous function --- lambda ---- passed as a parameter --- anonymous function -----
fun operateNumbers(a:Int,b:Int, operationLambda:(Int,Int) -> Int) : Int {
    val result = operationLambda(a,b)
    println(result)
    return result
}

/*

  () -> { }

 * */
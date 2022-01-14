package basics

fun main() {

    //calculate factorial of integer

    // 5! = 5 x 4 x 3 x 2 x 1
    // 4! = 4 x 3 x 2 x 1
    // 3! = 3 x 2 x 1
    // 2! = 2 X 1

   testing2()



}

fun testing2() {

println(subtractProductAndSum(12345))

}

fun subtractProductAndSum(n: Int): Int {

    // 12345
    //Subtract the Product and Sum of Digits of an Integer

    //sum = 1+2+3+4+5 = 15
    //prod = 1*2*3*4*5 = 120
    // product - sum = 105

    var product = 1
    var sum = 0
    var number = n

    while(number > 0){
       var rem = number % 10 //modulus
        number /= 10 //quotient

        product *= rem
        sum += rem

    }

    return product - sum
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

        println("The factorial of $userInput is ${factorial(userInput)}")
    }


}

fun factorial(num : Int) : Double{

    var factorial = 1.0 //minimum product is 1

    var number = num

    if(num < 0)
        return -1.0

    if(num == 0 || num == 1)
        return factorial

    while(number >= 2){
        factorial *= number
        number--
    }

    return factorial
}

/*

 //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

    //SI = (P X T X R)/100

    var principal : String = "0.0"
    var time : String = "0.0"
    var roi : String = "0.0"
    var simpleInterest = 0.0

    try{
        println("Please enter principal amount in rupees")
        principal = readLine()?:"0.0"

        println("Please enter time in years")
        time = readLine()?:"0.0"

        println("Please enter rate of interest")
        roi = readLine()?: "0.0"

       simpleInterest = principal.toDouble() * roi.toDouble() * time.toDouble() / 100.0

    }catch (e:Exception){
       // e.printStackTrace()
        principal = "0.0"
        time = "0.0"
        roi = "0.0"
    }finally {
        println("The simple interest is $simpleInterest")
    }




*/
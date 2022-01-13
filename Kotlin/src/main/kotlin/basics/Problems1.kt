package basics

import kotlin.random.Random

fun main(){

var sum = 1
var total = 0

/*repeat(10){
    val a = sum + total
    println(a)
}*/



val number  = 5

    when(number){
        0 -> println("zero")
        5 -> println("Five")
        else -> println("Timepass")
    }

    val hour = Random.nextInt(25)
    val timeOfDay : String

    timeOfDay = when(hour){
      in 0..5 -> "Early morning"
      in 6..11 -> "Morning"
      in 12..16 -> "Afternoon"
      in 17..19 -> "Evening"
      in 20..23 -> "Late evening"
        else -> "Invalid hour"
    }

    val number4 = Random.nextInt(1000)


    when{
        number4 % 2 == 0 -> println("Even when number is $number4")
        else -> println("Odd when number is $number4")
    }

    //println("$timeOfDay when hour is $hour")

    }




    /*


govind@ for(row in 1..5){
        println()
     columnLoop@   for(col in 1..5){
            val value = row * col

            if(value % 3 == 0)
               continue
            else if(value % 3 ==  1)
                print("\uD83E\uDD28\t")
            else if(value % 3 == 2)
                print("\uD83D\uDE31\t")
        }



Leap Year Rules: How to Calculate Leap Years

In the Gregorian calendar, three criteria must be taken into account to identify leap years:

The year must be evenly divisible by 4;
If the year can also be evenly divided by 100, it is not a leap year;
unless...
The year is also evenly divisible by 400. Then it is a leap year.


According to these rules, the years 2000 and 2400 are leap years,
while 1800, 1900, 2100, 2200, 2300, and 2500 are not leap years.

     // Input a year from the console and find whether it is a leap year or not.

   println("Enter year to check")

   var year = readLine()?:"0"

   var value = year.toInt()

   var isLeap = false

   if(value % 4 == 0){
       if(value % 100 == 0){
           if(value % 400 == 0)
               isLeap = true
        }
       else
           isLeap = true
   }

    println("Year $value is Leap year : $isLeap")
 */






/*

var a : Int = 55 //JAVA OBJECT equivalent is ANY
println(a * 5)

//JAVA VOID ===> UNIT KOTLIN

var t = false


fun add2() : Nothing {

    while(true){

    }
}



 /*
A customer comes to your shop to buy milk.
Ask his (her) name and tell them the cost of purchasing milk. Cost of one litre of milk is 40 rupees.

    println("What is your name")
    var name = readLine()

    println("How many litres of milk")
    var liters = readLine()?:"0.0"

    println("Hi $name. The total cost of milk is ${liters.toDouble() * 40}")



 */

/*
 */


Generate a random integer between 12 and 17.
Generate another random integer less than 100.
Generate third random integer which is a Double but less than 500.
Sum all the three numbers and also print their values when multiplied by 5.


 var name1 = Random.nextInt(12,18) //between 12 and 18 (not include 18)
    var name2 = Random.nextInt(100)
    var name3 = Random.nextDouble(500.0)

    var sum = name1 + name2+ name3
    println("The sum is $sum for the three numbers $name1, $name2 and $name3")
    println("Multiplied by 5 gives ${name1 * 5}, ${name2 * 5} and ${name3 * 5}")
    println("The type of sum is ${sum::class.java}")

 */



/*

 // Create a program that asks a user’s birth year.
   // Then prints out the user’s estimated age

println("Enter your birth year")
    var age = readLine()?:"0"
    println("The estimated age is ${2022 - age.toInt()}")



 */


/*

Leap Year Rules: How to Calculate Leap Years

In the Gregorian calendar, three criteria must be taken into account to identify leap years:

The year must be evenly divisible by 4;
If the year can also be evenly divided by 100, it is not a leap year;
unless...
The year is also evenly divisible by 400. Then it is a leap year.


According to these rules, the years 2000 and 2400 are leap years,
while 1800, 1900, 2100, 2200, 2300, and 2500 are not leap years.

* */
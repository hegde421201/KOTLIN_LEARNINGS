package basics

import kotlin.math.max

fun main() {

    //calculate factorial of integer

    // 5! = 5 x 4 x 3 x 2 x 1
    // 4! = 4 x 3 x 2 x 1
    // 3! = 3 x 2 x 1
    // 2! = 2 X 1

   testing5()

}

fun testing5() {

    var array2D : Array<IntArray> = arrayOf(intArrayOf(1,2,3,4), intArrayOf(3,2,1,5))
    println(maximumWealth(array2D))
}

fun maximumWealth(accounts: Array<IntArray>): Int {

  var maxima = Int.MIN_VALUE

  for(row in  accounts.indices)
  {
      var sum = 0
      for(col in accounts[row].indices)
          sum += accounts[row][col]

      if(sum > maxima) maxima = sum
  }

    return maxima
}


fun testing4() {
    var nums = arrayOf(1,3,2,1)
    getConcatenation(nums.toIntArray())

}

fun getConcatenation(nums: IntArray): IntArray {

    var answer = Array(nums.size * 2,{0}) //create an array of size double that of nums and set default values to 0 for all values

    for(index in nums.indices){
        answer[index] = nums[index]
        answer[index + nums.size] = nums[index]
        print("\t ${nums[index]}")
    }

    println()

    for (index in answer.indices)
        print("\t ${answer[index]}")


return answer.toIntArray()
}

fun testing3() {

    var nums = arrayOf(3,1,2,10,1)

    runningSum(nums.toIntArray())


}

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
    x   Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
* */

/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
* */


/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


* */

fun runningSum(nums: IntArray): IntArray {

    nums.forEach { print(it)
        print("\t")
    }

  println()
  for(index in 1 until nums.size)  {
      nums[index] = nums[index] + nums[index - 1]
  }

  nums.forEach { print(it)
  print("\t")
  }

    return nums
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
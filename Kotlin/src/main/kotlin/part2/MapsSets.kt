package part2

fun main(){

    //A map is a collection of pairs. Pair means (key,value).

    val yearOfBirth = mapOf("Antu" to 1988, "Baba" to 1990, "Chandu" to 1995)
    //println(yearOfBirth)

    //to ---- infix function
    //immutable map ---read only

    //26 jan --- 30 jan ,,,,,everyday attendance given.....total crowd ?

    val attendance = mutableMapOf(Pair("26 jan",2000),Pair("27 jan",5324),
        Pair("28 jan",455))

    //println(attendance)

    attendance["30 jan"] = 353
    attendance["29 Jan"] = 444
   // println(attendance)

    var sum = 0
    for((key,value) in attendance)
    {
        //println("$key -> $value") //string template
        sum += value

    }
  //  println("Total attendance : $sum")

   /* for(keys in attendance.keys)
        println("key $keys ->> value ${attendance[keys]}")
*/
   // for(keys in attendance)

    //29 jan attendance
    var attend29 = attendance["29 Jan"]?: 0
 //   println(attend29)



   //println("Total attendance : ${attendance}")


    val names = setOf("Anna","Antu","Govind","Chetan","Antu") //read only
    //println(names)

    val b = mutableSetOf<String>()

    b.addAll(names)
    b.add("Patel")
    println(b)

    val govind = arrayOf(1,2,3,4,4,3)
    val someSets = mutableSetOf(*govind) //spread operator
  /*  println(someSets)
    println(10 in someSets)
    println(someSets.remove(33))
    println(someSets)
    println(someSets.last())*/

    //odd length --- odd number of total elements always ---- array size will be odd number always and one element is guaranteed to be unique

    val someArray = arrayOf<Int>(12,13,17,12,13,16,16,16,16,13,13,14,14,12,12)
    //17

//    findUnique(someArray)

    val nums = intArrayOf(3,2,4)
   // println(twoSum(nums,6))

    println(twoSumHashMap(nums,6))

}

fun twoSumHashMap(nums: IntArray, target: Int): IntArray {
    var targetArray = intArrayOf(0,0)

    if(nums.isEmpty()) return targetArray

    var hashMap = mutableMapOf<Int,Int>()

    for(i in nums.indices)
    {
        if(hashMap.containsKey(nums[i]))
        {
            targetArray[0] = hashMap[nums[i]]?:0
            targetArray[1] = i

          //  println("${targetArray[0]} ${targetArray[1]}")
            return targetArray
        }

        hashMap[target - nums[i]] = i
      //  println(hashMap)


    }
    return targetArray
}


//two sum
fun twoSum(nums: IntArray, target: Int): IntArray {

   var targetArray = intArrayOf(0,0)

    if(nums.isEmpty()) return targetArray

    //BRUTE FORCE --- N * N ---- N squared ---O(N^2)

    var currentPos = 0
    for(i in 0..nums.size){
        for(j in i+1 until nums.size){
            if(nums[i] + nums[j] == target)
            {
                targetArray[0] = i
                targetArray[1] = j
            }
        }
    }

    println("${targetArray[0]} ${targetArray[1]}")
    return targetArray
}

fun findUnique(array: Array<Int>){

    if(array.isEmpty() || array.size % 2 == 0)return

    var uniqueSet = mutableSetOf<Int>()

    for(i in array){
        if(i in uniqueSet)
            uniqueSet.remove(i)
        else
            uniqueSet.add(i)
    }

    println(uniqueSet.first())
}

//MAPS and SETS

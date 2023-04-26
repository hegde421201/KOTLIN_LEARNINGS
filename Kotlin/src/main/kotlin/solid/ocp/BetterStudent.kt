package solid.ocp

class BetterStudent(val name:String,val registrationID : String,
                    val marks:Double,val department:String) {

    fun displayResult(){
        println("$name with registration ID $registrationID has scored $marks in the department $department\n")
    }
}


class DistinctionCalculator{

    val science = listOf("Computer Science","Biology")
    val arts = listOf("History","Politics")

    val TOTAL_SCORE = 50
    val SCIENCE_DISTINCTION = 0.75 * TOTAL_SCORE
    val ARTS_DISTINCTION = 0.70 * TOTAL_SCORE


    fun distinctionCalculation(student: BetterStudent){

        if(science.contains(student.department))
            if(student.marks >= SCIENCE_DISTINCTION)
                println("${student.name} studying in the ${student.department} has scored distinction in the Science subject\n")

        if(arts.contains(student.department))
            if(student.marks >= ARTS_DISTINCTION)
                println("${student.name} studying in the ${student.department} has scored distinction in the arts subject\n")
    }

}

fun main(){

    val studentsList = getStudentsData2()

    val distinctionCalculator = DistinctionCalculator()

    studentsList.forEach{
        it.displayResult()
        distinctionCalculator.distinctionCalculation(it)
    }
}

fun getStudentsData2(): List<BetterStudent> {

    val rakshit = BetterStudent("Rakshit","R1",45.0,"Computer Science")
    val pragati = BetterStudent("Pragati","R2",47.5,"Biology")
    val durgesh = BetterStudent("Durgesh","R3",32.5,"History")
    val yogita = BetterStudent("Yogita","R4",41.5,"Politics")

    return listOf(rakshit,pragati,durgesh,yogita)

}

/*
DistinctionCalculator and BetterStudent are different classes. The distinctionCalculation() function belongs to the
DistinctionCalculator class.getStudentsData2() function creates a list of students.

If in the future the exam authority changes the distinction criteria, you do not touch the BetterStudent class.
So, this part is closed for modification. This solves one part of the problem. Now think about another future possibility - The college authority can introduce a new stream such as commerce
and set a new distinction criterion for this stream.
You need to make some obvious changes again. For example, you need to modify the distinctionCalculation() function and add another if statement to consider commerce students.
Now the question is, is it ok to modify the distinctionCalculation() method in this manner?

Remember that each time we modify the function, we need to test the entire code workflow again.
This is a huge problem. In this example, every time the distinction criteria changes, we need to modify the distinctionCalculation() function in the DistinctionCalculator class.
So, this class is not closed for modification.

We have developed StudentOCP.kt class that follows the SRP and OCP principles.
*/


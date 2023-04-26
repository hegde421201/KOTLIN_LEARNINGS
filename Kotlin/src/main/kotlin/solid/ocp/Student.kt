package solid.ocp

class Student(val name:String,val registrationID : String,
              val marks:Double,val department:String) {

    val science = listOf("Computer Science","Biology")
    val arts = listOf("History","Politics")

    val TOTAL_SCORE = 50
    val SCIENCE_DISTINCTION = 0.75 * TOTAL_SCORE
    val ARTS_DISTINCTION = 0.70 * TOTAL_SCORE

fun displayResult(){
    println("$name with registration ID $registrationID has scored $marks in the department $department")
}

   fun distinctionCalculation(student: Student){

        if(science.contains(student.department))
            if(student.marks >= SCIENCE_DISTINCTION)
                println("${student.name} studying in the ${student.department} has scored distinction in the Science subject")

        if(arts.contains(student.department))
            if(student.marks >= ARTS_DISTINCTION)
                println("${student.name} studying in the ${student.department} has scored distinction in the arts subject")
    }
}

fun main()
{

val studentsList = getStudentsData()

studentsList.forEach{
    it.displayResult()
    it.distinctionCalculation(it)
}

}

fun getStudentsData(): List<Student> {

    val rakshit = Student("Rakshit","R1",45.0,"Computer Science")
    val pragati = Student("Pragati","R2",47.5,"Biology")
    val durgesh = Student("Durgesh","R3",32.5,"History")
    val yogita = Student("Yogita","R4",41.5,"Politics")

    return listOf(rakshit,pragati,durgesh,yogita)

}


/*

In this example,

When a student opts for computer science or biology, we say that they opt for the science stream.
Similarly, when a student belongs to the History or Politics department, they are considered to be arts students.

We have two instance methods in this example.
The displayResult() displays the result with all necessary details of a student and the distinctionCalculation() function evaluates whether a student is eligible for a distinction certificate.
If a science student scores above 75% in this examination, they get the certificate with distinction.
But the criterion for an arts student is slightly different. An arts student gets the distinction if their score is above 70%.

displayResult() and distinctionCalculation() violate the SRP principle. These two functions are unrelated and should not belong together in the Student class.

In the future, the exam authority can change the distinction criterion. In this case, we will need to change the distinctionCalculation() function.
Does it solve the problem? In the current situation, the answer is yes. But the college authorities can change the distinction criteria again. This requires re-testing of the Student() class again.
Remember that each time we modify the function, we change the containing class, we need to modify the existing test cases too.

So, this class does not follow the SRP,and it is also not closed for modification.

Checkout the BetterStudent class in this package for a better explanation.

* */

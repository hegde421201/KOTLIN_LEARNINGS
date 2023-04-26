package solid.ocp

abstract class StudentOCP(val name:String,val registrationID : String,
                 val marks:Double,val department:String) {

    fun displayResult(){
        println("$name with registration ID $registrationID has scored $marks in the department $department\n")
    }

}

fun main(){

    //get the students list
    val scienceList = getScienceData()
    val artsList = getArtsData()

    val scienceDistinctionCalculate = ScienceDistinctionCalculate()
    val artsDistinctionCalculate = ArtsDistinctionCalculate()

    scienceList.forEach {
        it.displayResult()
        scienceDistinctionCalculate.distinctionCalculate(it)
    }

    artsList.forEach {
        it.displayResult()
        artsDistinctionCalculate.distinctionCalculate(it)
    }

}

interface DistinctionCalculation{

    val TOTAL_SCORE: Int
        get() = 50

    fun distinctionCalculate(studentOCP: StudentOCP){

    }
}


fun getArtsData(): List<StudentOCP> {

    val durgesh = ArtsStudent("Durgesh","R3",32.5,"History")
    val yogita = ArtsStudent("Yogita","R4",41.5,"Politics")

    return arrayListOf(durgesh,yogita)
}

fun getScienceData(): List<StudentOCP> {

    val rakshit = ScienceStudents("Rakshit","R1",45.0,"Computer Science")
    val pragati = ScienceStudents("Pragati","R2",47.5,"Biology")

    return arrayListOf(rakshit,pragati)
}

//extending the abstract class
class ArtsStudent(name:String,registrationID : String,
                  marks:Double,department:String):StudentOCP(name,registrationID,marks,department){

                  }

//extending the abstract class
class ScienceStudents(name:String,registrationID : String,
                      marks:Double,department:String):StudentOCP(name,registrationID,marks,department){

}

class ArtsDistinctionCalculate : DistinctionCalculation{

    val ARTS_DISTINCTION = 0.70 * TOTAL_SCORE

    override fun distinctionCalculate(studentOCP: StudentOCP) {
        if(studentOCP.marks >= ARTS_DISTINCTION)
            println("${studentOCP.name} studying in the ${studentOCP.department} has scored distinction in the arts subject\n")
    }
}



class ScienceDistinctionCalculate  : DistinctionCalculation{

    val SCIENCE_DISTINCTION = 0.75 * TOTAL_SCORE

    override fun distinctionCalculate(studentOCP: StudentOCP) {
        if(studentOCP.marks >= SCIENCE_DISTINCTION)
            println("${studentOCP.name} studying in the ${studentOCP.department} has scored distinction in the science subject\n")
    }
}

/*

 The following program shows such an example. It is written using the OCP that suggests we write code segments
 (such as classes, or functions) that are open for extension but closed for modification.

The OCP can be achieved in multiple ways, but abstraction is the heart of this principle.
If we can design the application following OCP, then the application is flexible and extensible.

ArtsStudent and ScienceStudent are the concrete classes that extend the StudentOCP class and are used to provide the 'department'
information.

ArtsDistinctionCalculate and ScienceDistinctionCalculate implement this interface and override the distinctionCalculate(...)
function to specify the evaluation criteria as per their need. In this way, the stream-specific distinction criterion
is wrapped in an independent unit.

The Student class and DistinctionCalculation are both unchanged for any future changes in the distinction criteria.
They are closed for modification.
Every class follows the SRP.
Suppose you need to consider a new stream, say commerce.
Then you can create a new class such as CommerceStudent. Notice that in a case like this, you do not need to touch the ArtsStudent or ScienceStudent classes.

Similarly, when you consider different evaluation criteria for a different stream such as commerce, you can add a new derived class such as CommerceDistinctionCalculate
 that implements the DistinctionCalculation interface, and we can set new distinction criteria for commerce students.
In this case, we do not need to change any existing class in the DistinctionCalculation hierarchy.

Using this approach, we avoid an if-else chain. This chain could grow if you consider new streams such as commerce following the earlier approaches.
Avoiding a big if-else chain is always considered a better practice.
It is because avoiding the if-else chains lowers the cyclomatic complexity of a program and produces better code.
Cyclomatic complexity is a software metric to indicate the complexity of a program. It indicates the number
of paths through a particular piece of code. So, in simple terms, by lowering the cyclomatic complexity we make the code easily readable and testable.
*/


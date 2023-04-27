UNIT TESTING
------------

A unit test is a piece of code written by a software programmer to test certain functionality of code
The class to be tested is called class under test.
The function to be tested is called function under test.

Unit testing provides feedback to the programmer whether the classes/functions that have been written are correct or not.

Unit testing instantiates the class under test,executes the function under test and verifies whether it works as expected.

How JUnit works ?
------------------

JUnit has a runner which determines the tests, executes those tests, and reports the results.
Junit test validates expected result with actual output from the code under test.
Thus based on assertions success or failure it provides feedback to the programmer.

Assertions
-----------
JUnit 5 assertions help us in validating the expected output with the actual output of a test case.
Assertions are functions that we call in our tests to verify expected behaviour.
Assertions are present in org.junit.jupiter.api.Assertions class. 

We have covered the following topics in Assertions
* assertTrue()
* assertFalse()
* 


# assertTrue()
This function helps us in validating that the value supplied to it is true.
This function takes an actual value and checks whether it is true or not.
If actual value is true then the test case is passed or else it will fail.


Please follow this [link](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/main/kotlin/unittest/testing.md/) for Junit 5 testing for Kotlin classes and functions.

| Topic covered    | Link                                                                                                                                  | 
|------------------|---------------------------------------------------------------------------------------------------------------------------------------|
| First Sample     | [Click me](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/test/kotlin/unittest/SampleTest.kt/)                  |
| @Test Annotation | [Click me](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/test/kotlin/unittest/SampleTest.kt/)                  |
| Assertions       | [Click me](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/test/kotlin/unittest/assertions/AssertTrueSample.kt/) |
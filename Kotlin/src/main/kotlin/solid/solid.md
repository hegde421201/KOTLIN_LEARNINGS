SOLID PRINCIPLES
---------------

* Single Responsibility Principle (SRP)
* Open/Closed Principle (OCP)
* Liskov Substitution Principle (LSP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

Single Responsibility Principle (SRP)
------------------------------------
A class is a box that can hold things like data, properties, or methods. 
If you put in too much data or methods that are not related to each other, 
you will end up with a bulky class that can create problems in the future during enhancements.

Suppose we create a class with multiple methods that perform different functionalities. In such a case, 
even if you make a small change in one method, we need to retest the whole class again to ensure that the workflow is correct. 
Thus, changes in one method can impact the other related method(s) in the class. 
This is why the single responsibility principle (SRP) opposes this idea of putting multiple responsibilities in a class. 

It says that a class should have only one reason to change. So, before you create a class, identify the responsibility or purpose of the class. 
If multiple members help you achieve a single purpose, it is okay to place all the members inside the class.

When you follow SRP, your code is smaller, cleaner, and less fragile. 
So how do you follow this principle? a simple answer is you can divide a big problem into smaller chunks based
on different responsibilities and put each of these small parts into separate classes. 
The next question is, what do we mean by responsibility? In simple words, responsibility is a reason for a change.

We have a Customer class to discuss SRP.
This class can be found [here](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/srp/)
The Customer class that follows SRP is available [here](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/srp/)


Open/Closed Principle (OCP)
---------------------------
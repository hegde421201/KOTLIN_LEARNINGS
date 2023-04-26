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
This class can be found [here](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/srp/)<br>
The Customer class that follows SRP is available [here](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/srp/)

Note that the SRP does not say that a class should have at most one method.
Here the emphasis is on the single responsibility.
There may be closely related methods that can help you to implement a responsibility.

Open/Closed Principle (OCP)
---------------------------
According to its definition - A software artifact should be open for extension but closed for modification.

We will discuss the OCP principle using Kotlin classes.

Any modular decomposition technique must satisfy the Open-Closed Principle. Modules should be both open and closed.
The contradiction between the two terms is apparent as they correspond to end results of a different nature.

A module is said to be open if it is still available for extension. 
For example, the module should be able to expand its set of operations or add fields to its data structures.

A module is said to be closed if it is available for use by other modules. 
This assumes that the module has been given a well-defined, stable description (its interface in the sense of information hiding). 
At the implementation level, closure for a module also implies that you may compile it, perhaps store it in a library, and make it available for others (its clients) to use.
The need for modules to be closed and the need for them to remain open arise for different reasons.

The idea behind this design philosophy is that in a stable and working application, once we create a class and other parts of our application start using it, 
any further change in the class can cause the working application to break.
If we require new functionalities, instead of changing the existing class, we can extend it to adopt the new requirements. 

What is the benefit? Since we do not change the old code, our existing 
functionalities continue to work without any problems, and we can avoid testing them again. Instead, we test the 'extended' part or functionalities only.

If we use inheritance to satisfy the above requirement then it introduces tight coupling. To mitigate this issue, we use the concept of polymorphic OCP.
The new proposal uses abstract base classes that use the protocols instead of a superclass to allow different implementations. 
These protocols are closed for modification, and they provide another level of abstraction that enables loose coupling.

To illustrate OCP we have a Student class that does not have OCP and then we develop a BetterStudent class that adheres to the OCP.
[Student](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/ocp/)<br>
[BetterStudent](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/ocp/)<br>
[Final OCP - StudentOCP](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/ocp/)<br>

Liskov Substitution Principle (LSP)
------------------------------------

See the class Payments.kt [here](https://github.com/hegde421201/KOTLIN_LEARNINGS/tree/main/Kotlin/src/main/kotlin/solid/lsp/)



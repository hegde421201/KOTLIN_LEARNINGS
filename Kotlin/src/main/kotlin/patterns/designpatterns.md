Observer pattern
-----------------
It defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Concept:
In this pattern, there are two types of objects. One is an observer and the other is the subject.
Who is the observer?
Observer is an object that needs to be informed when things happen in another object.
The object about whom an observer is interested is called the subject.
Normally many observers observe a particular subject. Since the observers are interested in the changes in a subject, 
they register themselves to get the notifications from the subject. 
When they are not interested in the subject, they unregister from the subject. Sometimes this model is referred to as the Publisher-Subscriber model.

The gist of the observer pattern is as follows: 
Using this pattern, an object (subject) can send notifications to multiple observers, or a set of objects, at the same time. 
Observers can decide how to respond/react to these notifications. You can visualize the scenarios with the following diagrams.

[Observer patterns](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/main/kotlin/patterns/observer/observer.png/)


In the above diagram we have :

Step 1: Three observers request notification from a subject.

Step 2: The subject can grant the requests as the connection is established

Step 3: The subject sends notifications to the registered users.

Step 4: This is an optional step. Observer 2 does not want to get further notifications and requests to unregister themselves 
(or the subject does not want to keep Observer 2 in the notification list due to some reason, 
so it unregisters Observer 2). Thus, the connection between the subject and Observer 2 is lost.

Step 5: This is again dependent on step 4. From now onwards, only Observer 1 and Observer 3 get notifications from the subject.

Real life examples : 
1) An email subscription or any newsletter subscription follows observer pattern. 
2) You can also find the observer pattern in the case of sports celebrities. The fans (followers) of a 
   particular celebrity follow him (her) and want to get all important information bites as long as it appeals to them. 
   As soon as their interest in the celebrity wanes, they unfollow him (her).
   Here the fans are the observers and the celebrity is a subject.

Example:
------

Please check the file Observers.kt for a Kotlin implementation.





Model View Controller (MVC) pattern
------------------------------------

Model–view–controller (MVC) is a software design pattern commonly used for developing user interfaces that divides the program logic into three interconnected elements. 
This is done to separate internal representations of information, from the ways information is presented to and accepted from the user.

An easy way to understand MVC: the model is the data, the view is the window on the screen, and the controller is the glue between the two.

Concept:
Using this pattern, we separate the user interface logic from the business logic and decouple the major components in such a way that they can be reused efficiently. 
This approach promotes parallel development.
From the definition, it is apparent that the pattern consists of these major components: model, view, and controller. 
The controller is placed between the view and model in such a way that they can communicate to each other only through the controller. 
This model separates the mechanism of how the data is displayed from the mechanism of how the data will be manipulated.
The diagram below shows a typical MVC pattern.

[MVC](https://github.com/hegde421201/KOTLIN_LEARNINGS/blob/main/Kotlin/src/main/kotlin/patterns/mvc/mvc.png/)



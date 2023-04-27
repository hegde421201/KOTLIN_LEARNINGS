package solid.dip

class PostGresDatabase {
   fun saveCustomerIdDB( customerID : String)
    {
        println("Customer ID $customerID saved to database")
    }
}

 class UserInterface {
    private val postGresDatabase: PostGresDatabase = PostGresDatabase()

     fun saveCustomerId(custId: String) {
        postGresDatabase.saveCustomerIdDB(custId)
    }
}

fun main(){

    val userInterface = UserInterface()
    userInterface.saveCustomerId("C9000")
}

/*

Assume that we have a two-layer application.
Using this application, a user can save a customer ID in a database.
To learn this concept, let us use a console application instead of a GUI application.
We have two classes, UserInterface and PostGresDatabase.
UserInterface represents a user interface such as a form where a user can type a customer ID and click the Save button to save the ID to a database.

PostGresDatabase class is used to imitate a postgres database.
There is no actual database in this application and there is no code to validate a customer ID for easier explanation of DIP.

By using the saveCustomerId() method of UserInterface, you can save the customer id to a database.


The program suffers from the following problems:

1) The top-level class (UserInterface) has too much dependency on the bottom-level class (PostGresDatabase).
These two classes are tightly coupled. So, in the future, if the PostGresDatabase class changes (for example, when we change the signature of the saveCustomerIdDB(...) function),
we need to adjust the UserInterface class.

2) The low-level class should be available before we write the top-level class. So, we are forced to complete the low-level class before we write or test the high-level class.

3) What if we use a different database? For example, we may want to switch from the PostGres database to a Oracle database or we may need to support both.

* */



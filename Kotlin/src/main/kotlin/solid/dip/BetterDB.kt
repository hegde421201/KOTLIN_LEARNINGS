package solid.dip

interface Database {
    fun saveCustomerIdDB(customerID: String)
}

class PostGresDatabase2 : Database {

    override fun saveCustomerIdDB(customerID:String) {
         println("Customer ID $customerID saved in the postgres database")
    }
}

class OracleDatabase : Database {
    override fun saveCustomerIdDB(customerID: String) {
        println("Customer ID $customerID saved in the oracle database")
    }

}

/*
 The first part of the DIP asks us to use abstraction.
 This makes the program efficient. So, this time the UserInterface class targets the abstraction Database,
 instead of a concrete implementation such as PostGresDatabase2. Here is the new construct of UserInterface
* */

 class UserInterface2(var database: Database) {
    fun saveCustomerId(customerID: String) {
        database.saveCustomerIdDB(customerID)
    }


}

/*
 The second part of the DIP suggests us to make the Database interface considering the need for the UserInterface class.
 It is important because if an interface needs to change to support one of its clients, other clients can be impacted due to the change.

* */

fun main(){

    var database : Database = OracleDatabase()

    var userInterface = UserInterface2(database)
    userInterface.saveCustomerId("C004")


    database = PostGresDatabase2()

    userInterface = UserInterface2(database)
    userInterface.saveCustomerId("C008")
}


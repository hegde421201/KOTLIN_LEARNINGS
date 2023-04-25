package solid.srp

import kotlin.random.Random

class CustomerSRP(val firstName:String,val lastName:String,val products:Int) {

    fun displayCustomerDetail(){
        println("Customer name is $firstName $lastName")
        println("Purchased products are $products")
    }

}

class CustomerIDGenerator(){

    fun generateCustomerId(firstName:String) : String{
        val random = Random.nextInt(3000,95000)
        val custID = firstName.substring(0,2)+random //consider first two letters

        return custID
    }

}

class LoyaltyChecker(){

    fun checkLoyalty(products: Int) = if(products >=5) "Loyal" else "Not loyal"

}

fun main(){


    val kaushik = CustomerSRP("Kaushik","Verma",10)
    val kaveri = CustomerSRP("Kaveri","Jha",2)

    kaushik.displayCustomerDetail()
    kaveri.displayCustomerDetail()

    //generate Customer ID
    val idGenerator = CustomerIDGenerator()
    println(idGenerator.generateCustomerId(kaushik.firstName))
    println(idGenerator.generateCustomerId(kaveri.firstName))

    //check loyalty
    val loyaltyChecker = LoyaltyChecker()
    println(loyaltyChecker.checkLoyalty(kaushik.products))
    println(loyaltyChecker.checkLoyalty(kaveri.products))
}


/*
 In the above example, we introduced two more classes.
 The LoyaltyChecker class now contains the checkLoyalty() method
 and the CustomerIDGenerator class contains the generateCustomerId() method to generate the customer id.
 As a result, in the future, if we need to change the program logic to determine the loyalty or
 use a new algorithm to generate a customer id, we can make the changes in the respective classes.
 Other classes are untouched, so we do not need to retest those classes.


Note that the SRP does not say that a class should have at most one method.
Here the emphasis is on the single responsibility.
There may be closely related methods that can help you to implement a responsibility.
* */
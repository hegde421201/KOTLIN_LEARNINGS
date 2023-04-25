package solid.srp

import kotlin.random.Random

/*

 The Customer class has three methods:
 1) The displayCustomerDetail() shows the customer's name and the number of products purchased over the years.

 2) The generateCustomerId() method generates a customer id using string concatenation.
 The logic is simple: We concatenate the first two letters of the first name with a random number to form a customer ID.
 In the following demonstration, inside the main() method, I have created two Customer instances and use these methods to display the relevant details.

 3) The checkLoyalty() method evaluates whether an customer is loyal or not. We assume that if the customer has purchased more than 5 products over the years
 then he(she) is loyal or else not.

* */

class Customer(val firstName:String,val lastName:String,val products:Int) {

    fun displayCustomerDetail(){
        println("Customer name is $firstName $lastName")
        println("Purchased products are $products")
    }

    fun generateCustomerId(firstName:String) : String{
        val random = Random.nextInt(3000,95000)
        val custID = firstName.substring(0,2)+random //consider first two letters

        return custID
    }

    fun checkLoyalty(products: Int) = if(products >=5) "Loyal" else "Not loyal"

}

fun main(){

val kaushik = Customer("Kaushik","Verma",10)
val kaveri = Customer("Kaveri","Jha",2)

kaushik.displayCustomerDetail()
kaveri.displayCustomerDetail()

println(kaveri.generateCustomerId(kaveri.firstName))
println(kaushik.checkLoyalty(kaushik.products))

}

/*

 What is the problem with this design?

 The answer is that we have violated the SRP here.
 We can see that displaying  customer details, generating customer ID, or checking loyalty are all different activities.
 Since we wrote everything in a single class, We might face problems adopting new changes in the future. Here are some possible reasons:

• The top management can set a different criterion to decide loyalty.
• They can also use a complex algorithm to generate the customer id.
In each case, We will have to modify the Customer class.
Now we can understand that it is better to follow the SRP and separate these activities.
* */


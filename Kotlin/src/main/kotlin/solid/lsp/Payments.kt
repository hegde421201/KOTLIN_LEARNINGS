package solid.lsp

import kotlin.jvm.Throws

interface Payments {
   fun newPayment()
    fun previousPaymentInfo()
}

/*

Assume that we have a payment portal where a registered user can raise a payment request.
We use method newPayment() for this. In this portal, we can also show the user’s last payment details using a method called previousPaymentInfo().

Furthermore, you create the helper class PaymentHelper to display all the
previous payments and the new payment requests of these users.
You use showPreviousPayments() and processNewPayments() for these activities.

These methods call previousPaymentInfo() and newPayment() on the respective Payment instances.

* */

class RegisteredUserPayment(val userName:String) : Payments {

     var name : String = userName


    override fun newPayment() {
        println("Processing new payment request for $name")
    }

    override fun previousPaymentInfo() {
        println("Retrieving previous payment history for $name")
    }

}

class PaymentHelper {

    val payments = arrayListOf<Payments>()

    fun addUser(user:Payments){
        payments.add(user)
    }

    fun showPreviousPayments(){
        payments.forEach {
            it.previousPaymentInfo()
        }
    }

    fun processNewPayments(){

        payments.forEach {
            it.newPayment()
        }
    }

}

class GuestUserPayment : Payments{
    override fun newPayment() {

    }

    @Throws(Exception::class)
    override fun previousPaymentInfo() {
        throw Exception("Error unsupported operation for guest user")
    }


}

fun main(){

    val paymentHelper = PaymentHelper()

    //two users
    val raviPayment = RegisteredUserPayment("Ravi")
    val jhansiPayment = RegisteredUserPayment("Jhansi")

    //guest user
    val guestUserPayment = GuestUserPayment()

    //adding the two users to the helper
    paymentHelper.addUser(raviPayment)
    paymentHelper.addUser(jhansiPayment)

    paymentHelper.addUser(guestUserPayment)

    //processing the payments
    paymentHelper.showPreviousPayments()
    paymentHelper.processNewPayments()

}

/*Assume we have a new requirement
We need to support guest user payments

We can process a guest user’s payment request, but we do not show their last payment detail.
By adding the guest user to the paymentHelper, the code breaks because of the exception.

If we use the if-else chain to verify whether the Payment instance is a GuestUserPayment or a RegisteredUserPayment then we are violating the OCP.

A better version of this program is in this class BetterPayments.kt

*/



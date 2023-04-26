package solid.lsp

import kotlin.jvm.Throws


/*

 In this version, we remove the newPayment() function from the Payments interface.
 We place this function into another interface called NewPayments. As a result, now we have two interfaces with the specific operations.
 Since all types of users can raise a new payment request, the concrete classes of RegisteredUserPayment and GuestUserPayment both implement the NewPayments interface.
 But we show the last payment detail for the registered users only.
 So, the RegisteredUser class implements the Payments interface.

* */


class RegisteredUserPayment2(val userName:String) : NewPayments,PreviousPayment {

    var name : String = userName


    override fun newPayment() {
        println("Processing new payment request for $name")
    }

    override fun previousPaymentInfo() {
        println("Retrieving previous payment history for $name")
    }

}

class PaymentHelper2 {

    val prevPayments = arrayListOf<PreviousPayment>()
    val newPayments = arrayListOf<NewPayments>()

    fun addPreviousPayment(payment: PreviousPayment){
        prevPayments.add(payment)
    }

    fun addNewPayment(payments: NewPayments){
        newPayments.add(payments)
    }

    fun processNewPayments(){
        newPayments.forEach {
            it.newPayment()
        }
    }

    fun showPreviousPayments(){

        prevPayments.forEach {
            it.previousPaymentInfo()
        }
    }

}

fun main(){

    val paymentHelper = PaymentHelper2()

    //two users
    val raviPayment = RegisteredUserPayment2("Ravi")
    val jhansiPayment = RegisteredUserPayment2("Jhansi")

    //guest user
    val guestUserPayment = GuestUserPayment2()

    //adding the two users to the helper
    paymentHelper.addNewPayment(raviPayment)
    paymentHelper.addNewPayment(jhansiPayment)
    paymentHelper.addNewPayment(guestUserPayment)

    paymentHelper.addPreviousPayment(raviPayment)
    paymentHelper.addPreviousPayment(jhansiPayment)


    //processing the payments
    paymentHelper.showPreviousPayments()
    paymentHelper.processNewPayments()
}

class GuestUserPayment2 : NewPayments{
    override fun newPayment() {
        println("Processing guest user");
    }

}

/*
 Notice that in this class example, inside the showPreviousPayments() method, we process PreviousPayment instances and inside the NewPayments() method,
 we process NewPayment instances. This new structure solves the problem we faced in
 the earlier example. We can see that this modified design conforms to the LSP because objects are clearly substitutable and the program works properly.
* */


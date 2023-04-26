package solid.isp

interface Printer {
    fun sendFax()
    fun printDocument()
}

interface Fax {
    fun faxType()
}

class LanFax : Fax {
    override fun faxType() {
        println("Using lan fax to send the fax")
    }
}

class EFax : Fax {
    override fun faxType() {
        println("Using lan fax to send the fax")
    }
}

class BasicPrinter : Printer {
    override fun printDocument() {
        println("The basic printer prints a document.")
    }

    override fun sendFax() {
        throw UnsupportedOperationException()
    }
}

class AdvancedPrinter : Printer {
    override fun printDocument() {
        println("The advanced printer prints a document.")
    }

    override fun sendFax() {
        println("The advanced printer sends fax.")
    }
}

fun main(){

    val advPrinter = AdvancedPrinter()
    advPrinter.sendFax()
    advPrinter.printDocument()

    val basicPrinter = BasicPrinter()

    basicPrinter.printDocument()
  //  basicPrinter.sendFax() //causes error

}


/*

Assume that we have the interface Printer with two methods, printDocument() and sendFax().
There are several users of this class. Let’s consider two such users : BasicPrinter and AdvancedPrinter.

interface Printer {
     fun sendFax()
     fun printDocument()
}

A basic printer can print documents. It does not support any other functionality.
So, BasicPrinter needs the printDocument() method only.

An advanced printer can print documents and also send faxes. So, the AdvancedPrinter needs both methods.

In this case, a change to the sendFax() method in AdvancedPrinter can force the interface Printer to change, which in turn, forces the BasicPrinter code to recompile.
This situation is unwanted which can cause potential problems in the future.

Let us assume that we have to show the type of fax  being used in a future requirement. Some types of fax methods are
LanFax, InternetFax, and AnalogFax.
So, earlier, the sendFax() method did not use any parameters, but now it needs to accept a parameter to show the type of fax it uses.

To use this inheritance hierarchy, once you modify the sendFax() method to sendFax(Fax faxType) in the AdvancedPrinter class,
It demands you change the interface Printer (here we break the OCP).
But it is not over yet! When you update Printer, you need to update the BasicPrinter class too to accommodate this change.
Modifying Printer interface violates the OCP as well.

The above code logic is similar to the code examples we saw for LSP which caused runtime exception.

It is pretty clear that a basic printer does not need to send a fax. But since BasicPrinter implements Printer,
it needs to provide a sendFax() implementation. As a result, when sendFax() changes in the Printer interface,
BasicPrinter needs to accommodate the change. The ISP suggests you avoid this kind of situation.

We will see PrinterISP.kt class with the enhancement to resolve these potential problems.

*/



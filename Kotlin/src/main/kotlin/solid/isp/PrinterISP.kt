package solid.isp

interface PrinterISP {

    fun printDocument()
}

internal interface FaxDevice {
    fun sendFax(faxType:String)
}

 class BasicPrinterISP : PrinterISP {
    override fun printDocument() {
        println("The basic printer prints a document.")
    }
}

 class AdvancedPrinterISP : PrinterISP, FaxDevice {
    override fun printDocument() {
        println("The advanced printer prints a document.")
    }

    override fun sendFax(faxType: String) {
        println("The advanced printer sends a fax. The fax type is $faxType")
    }
}


fun main(){

    val advPrinter = AdvancedPrinterISP()
    advPrinter.printDocument()

    val faxDevice: FaxDevice = AdvancedPrinterISP()
    faxDevice.sendFax("Internet Fax")

    val basicPrinter = BasicPrinterISP()

    basicPrinter.printDocument()

}

/*
 A viable solution

We understand that there are two different activities: one is to print some documents and the other is to send a fax.
So, in this example, we create two interfaces named PrinterISP and FaxDevice.

PrinterISP contains the printDocument() function and FaxDevice contains the SendFax() function.

The idea is straight forward:

The class that wants print functionality implements the PrinterISP interface, and the class that wants fax functionality implements the FaxDevice interface.
If a class wants both functionalities, it implements both interfaces.

* */
package patterns.observer


/*

  In this example, we have two inheritance chains, one for the subject and one for the observers.

  The observer hierarchy starts with the Observer interface.
  Two concrete types of Employee and Customer implement this interface.

  We have two different types of observers to demonstrate that they need not belong to the same class.

  Consider a real-world example. A company has both employees and customers who can purchase the company stocks.
  As a result, they like to get alerts when the stock price changes. In this case, both customers and employees are the observers and the company is the subject.
 * */


 interface Observer {
    fun getNotification(company: Company)
    val observerName: String?
}

//classes Employee and Customer implement the Observer interface
class Employee(override val observerName: String?) : Observer{


    override fun getNotification(company: Company) {
        println("$observerName received an alert from ${company.subject}")

    }



}

abstract class Company(var subject:String?){

    var observerList: ArrayList<Observer> = ArrayList()

    var stockPrice:Double
        get() {
            return stockPrice
        }
        set(value){

            this.stockPrice = value

            notifyObservers()
        }

    //register an observer
    abstract fun register(obs : Observer)

    //unregister an observer
    abstract fun unRegister(obs:Observer)

    //notify registered observers
    abstract fun notifyObservers()


}

class XYZCompany(name: String?) : Company(name) {


    override fun register(obs: Observer) {
        observerList.add(obs)
        println("$subject adds ${obs.observerName } as an observer")
    }

    override fun unRegister(obs: Observer) {

    }

    override fun notifyObservers() {

    }

}
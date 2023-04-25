package oop

class Employee(var firstName:String,var lastName:String,var salary : Double) {

    val fullName
        get() = "$firstName $lastName"
}

//Here the keyword class is followed by the name of the class, Employee.
//Within the parentheses after the class name lies the primary
//constructor for the class, and for Employee you’re indicating that there are two mutable String properties, firstName and lastName.
//The third mutable property is the property of type Double - salary.
//Employee has another property named fullName with a custom getter that uses the
//other properties in its definition. It uses both the firstName and lastName properties to compute the fullName.

fun main(){

    val saket = Employee(firstName = "Saket","Sahoo",145000.0)

    //We create the instance of the class Employee by using the class name and passing in the arguments to the constructor.
    //Since there are two String properties, we have explicitly defined the firstName property,and have not explicitly
    //defined the lastName property. We can choose to define the lastName property as well. The third argument is the
    //double number that constitutes the salary.

    //In this example we have changed the order of the properties and hence have to explicitly define them
    val manjeet = Employee(lastName="Kaur", firstName = "Manjeet Singh", salary = 1567900.0)

    //We can also choose not to define the properties explicitly. In this case the arguments will be assigned order-wise.
    val gourav = Employee("gourav","juneja",34127.9)

    println(gourav.salary)
    println(manjeet.fullName) //here we print the fullname that uses the firstName and lastName properties.
    println(saket.lastName)
}


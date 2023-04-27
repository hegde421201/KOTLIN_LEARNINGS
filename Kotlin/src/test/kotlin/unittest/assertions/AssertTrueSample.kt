package unittest.assertions

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AssertTrueSample {

//check the Bookservice.kt class methods in the package unittest.assertions of the main directory
    //We have discussed all 6 functions of assertTrue below

    @Test
    fun assertTrueWithNoMessage(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //if the list is not empty test case fails  --- AssertionFailedError expected: <true> but was: <false>
        assertTrue(listBooks.isEmpty())

    }


    @Test
    fun assertTrueWithMessage(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //if the list is not empty test case fails  --- List of books is not empty. Size is 1 ==> expected: <true> but was: <false>
        assertTrue(listBooks.isEmpty(),"List of books is not empty. Size of list is ${listBooks.size}")

    }

    @Test
    fun assertTrueWithMessageSupplier(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //Supplier<String> defined here
        val supplierLambda : () -> String = { "List of books is not empty. Size of list is ${listBooks.size}" }


        //if the list is not empty test case fails  --- List of books is not empty. Size is 1 ==> expected: <true> but was: <false>
        assertTrue(listBooks.isEmpty(), supplierLambda)
    }

    @Test
    fun assertTrueWithBooleanSupplierAndNoMessage(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //Supplier<String> defined here
        val supplierLambdaBoolean : () -> Boolean = { listBooks.isEmpty() }


        //if the list is not empty test case fails  --- List of books is not empty. Size is 1 ==> expected: <true> but was: <false>
        assertTrue(supplierLambdaBoolean)
    }

    @Test
    fun assertTrueWithBooleanSupplierAndMessage(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //Supplier<String> defined here
        val supplierLambdaBoolean : () -> Boolean = { listBooks.isEmpty() }


        //if the list is not empty test case fails  --- List of books is not empty. Size is 1 ==> expected: <true> but was: <false>
        assertTrue(supplierLambdaBoolean,"List of books is not empty. Size is ${listBooks.size}")
    }


    @Test
    fun assertTrueWithSuppliers(){

        val bookService = BookService() //create the object

        val listBooks : List<Book> = bookService.books() //return the book list

        val bookKotlinTuts = Book("Hegde","Kotlin Testing","Buns Publishing House")

        //assertTrue(listBooks.isEmpty()) //if the list is empty the test case passes

        bookService.addBook(bookKotlinTuts)

        //Supplier<String> defined here
        val supplierLambdaBoolean : () -> Boolean = { listBooks.isEmpty() }
        val supplierLambdaString : () -> String = { "List of books is not empty. Size is ${listBooks.size}" }

        //if the list is not empty test case fails  --- List of books is not empty. Size is 1 ==> expected: <true> but was: <false>
        assertTrue(supplierLambdaBoolean,supplierLambdaString)
    }
}
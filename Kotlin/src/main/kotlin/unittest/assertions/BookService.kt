package unittest.assertions

import java.util.Collections

class BookService {

    val bookList = arrayListOf<Book>()

    fun addBook(book: Book){
        bookList.add(book)
    }

    fun books(): List<Book> = Collections.unmodifiableList(bookList)

}
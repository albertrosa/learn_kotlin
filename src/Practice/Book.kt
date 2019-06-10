package Practice

open class Book(val title: String, var author: String) {

    var currentPage = 0

    open fun readPage() { currentPage++ }
}


class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    var wordCount = 0

    override fun readPage() { wordCount = wordCount + 250 }
}
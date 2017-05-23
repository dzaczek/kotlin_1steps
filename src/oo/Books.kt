package oo

import com.sun.image.codec.jpeg.TruncatedFileException

/**
 * Created by dzaczek on 5/23/17.
 */
class Books {
    var Title: String
    var Author: String
    var publicationYear: Int
    var borrowed: Boolean

    constructor(Title: String, Author: String, publicationYear: Int) {
        this.Title = Title
        this.Author = Author
        this.publicationYear = publicationYear
        this.borrowed = false
    }


    fun about() {
        println("Title:\t $Title.\tAuthor:\t$Author.\tYear:$publicationYear.\t")
    }

    fun borrowed() {
        when (borrowed) {
            true -> println("Ist Borrowed")
            false -> println("Is Available")

        }
    }

    fun retun() {
        this.borrowed = false

    }

    fun borrow() {
        this.borrowed = true
    }

}

fun main(args: Array<String>) {
    val book1 = Books("Digital Fortess", "Dan Brown", 1998)

    book1.about()
    book1.borrowed()
    book1.borrow()
    book1.borrowed()
    book1.retun()
    book1.borrowed()


}
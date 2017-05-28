package oo.ooexi

/**
 * Created by dzaczek on 5/28/17.
 */

interface  Lendable{
    fun borrow()
    fun returniteam()
    fun status_iteam()


}

abstract class Inventory(open var title:String,open var genre:Int,open var publicationyear:Int,open var borrowed:Boolean):Lendable{
    override fun borrow(){
        if(borrowed){
            print("This iteam is borrowed")
        }else{

            println("You now borrowing this iteam")
            borrowed=true
        }

    }
    override fun status_iteam(){
        println("Book is Borrowed :$borrowed ")
    }
    override fun returniteam(){
        if(borrowed){
            println("You now returned  this iteam")
            borrowed=false
        }else{
            println("Sory you cant return this iteam ")
        }


    }
}

data class Book(var author:String,
                override var title: String,
                override var publicationyear:Int,
                override var genre: Int):Inventory(title,genre,publicationyear,false) {

}
data class Dvd(var Lenght:Long,
               override var title: String,
               override var genre: Int,
               override var publicationyear: Int):Inventory(title, genre, publicationyear,false){

}

fun main(args: Array<String>) {
    val book1=Book(title = "Digital Fortess", author = "Dan Brown", publicationyear = 1998, genre = 1998)
    println(book1)
    book1.borrow()
    book1.status_iteam()
    book1.borrow()
    book1.status_iteam()
    book1.returniteam()
    book1.status_iteam()
    book1.returniteam()
    book1.status_iteam()

    val dvd1=Dvd(Lenght = 3600,title = "The Decline of Western Civilization",genre =1979,publicationyear = 1981)
    println(dvd1)
    dvd1.status_iteam()
    dvd1.borrow()
    dvd1.returniteam()



}


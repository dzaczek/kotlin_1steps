package oo.ooexi

/**
 * Created by dzaczek on 5/28/17.
 */

interface  Lendable{
     fun borrow(){
    printlm("Borrow")
    }
}

abstract class Inventory(open var title:String,open var genre:String,open var publicationyear:Int){

}

data class Book(var author:String,override var title: String,override var publicationyear:Int,override var genre: String):Inventory(title,genre,publicationyear) {

}
data class Dvd(var Lenght:Long, override var title: String, override var genre: String, override var publicationyear: Int):Inventory(title, genre, publicationyear){

}


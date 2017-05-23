package oo

/**
 * Created by dzaczek on 5/23/17.
 */

class House(val height:Double,val color:String, val price:Int){
    fun print(){
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house1=House(5.0,"green",40000)
    val house2=House(height = 5.0,color = "green",price = 40000)
    val house3=House(color = "red",height = 5.0,price = 40000)
    house1.print()
    house2.print()
    house3.print()
}

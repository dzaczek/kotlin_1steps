package oo

/**
 * Created by dzaczek on 5/26/17.
 */
abstract class Lakes(val name: String,val area: Double){
 open fun about(){
     println("Hello I'm Lake $name, size is $area")
 }
}

open class Marslake(): Lakes("Secret Mars Lake",7778.8),WatchTheLake{
    override  final fun about(){
        super<WatchTheLake>.about()
        super<Lakes>.about()
        println("Hi I'm $name")
    }
}
interface  WatchTheLake{
    fun about(){
        println("Observes Lake....")
    }

}

class RaportAbourMarLake(): Marslake(){
    //override fun about(){
    //    println("Hi I'm $name adn i`m not suitable for drink ")
   // }
}

fun main(args: Array<String>) {
    val astrolake=Marslake()
    astrolake.about()
    val astroreport=RaportAbourMarLake()
        astroreport.about()

}
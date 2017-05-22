package oo

import java.util.*

/**
 * Created by dzaczek on 5/22/17.
 */
class Person{
    val name: String="Sarah"
    var age:  Int = 42


    //method
    fun speak(){
        println("Hello")
    }
    //method with valiable
    fun greet(mame:String){
        println("Hello $name")
    }
    //overload operators
    fun greet(){
        println("Hello Unknow")
    }
    fun getYearOfBirth():Int{
        return Calendar.getInstance().get(Calendar.YEAR)-age
    }
    fun getYearOfBirth2()=Calendar.getInstance().get(Calendar.YEAR) - age
}

fun main(args: Array<String>) {
    val person1=Person()
    println(person1.age)
    println(person1.name)
    person1.speak()
    person1.greet("Pete")
    person1.greet()
    println(person1.getYearOfBirth())
    println(person1.getYearOfBirth2())

}
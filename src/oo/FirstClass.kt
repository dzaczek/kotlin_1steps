package oo

import java.util.*
import javax.naming.Name

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
class Person2(name:String,age:Int) {
    val name: String
    var age: Int
    var bryear = Calendar.getInstance().get(Calendar.YEAR) - age

    init {
        this.name = name
        this.age = age
        println("object was created")

    }
}
    class Person3(var name:String,var age:Int) {

        var bryear = Calendar.getInstance().get(Calendar.YEAR) - age

        init {

            println("object was created")

        }
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

    val new_person=Person2("Pete",23)
    println(new_person.bryear)
    val new2_person=Person3("Pete",27)
    println(new2_person.bryear)
}
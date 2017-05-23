package oo

import java.util.*

/**
 * Created by dzaczek on 5/23/17.
 */
open class Person(open val name:String, open var age:Int){

    init {
        println("clas hPerson created")
    }
    fun speak(){
        println("hello")
    }
    fun greet(name:String){
        println("Hello $name")
    }
    // Calendar.getInstance().get(Calendar.YEAR)
    fun bry():Int{
        var bry=Calendar.getInstance().get(Calendar.YEAR)-age
        return bry
    }
}

class Student (override val name:String,override var age:Int, val studentid:Long): Person(name,age) {
    fun speka(){
        println("Hi there!")
    }
    fun speka(name:String){
        println("Hi there! $name ")
    }
}

class Employee (override val name:String,override  var age:Int):Person(name,age) {
    fun speka(){
        println("Good morning")
    }
    fun speka(name:String){
        println("Hi $name ")
    }
}

fun main(args: Array<String>) {
    val student=Student("adam",74,55763273)
    student.speak()
    println(student.bry())
    val emp=Employee("Pete",33)
    emp.speka()
    println(emp.bry())
//
    val person=Person("tom",55)
}
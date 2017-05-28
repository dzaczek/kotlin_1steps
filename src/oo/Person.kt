package oo

import java.util.*

/**
 * Created by dzaczek on 5/23/17.
 */

open  class Normal
class SubClass:Normal()


abstract class Person(open val name:String, open var age:Int){

   abstract  fun speak()

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
    override fun speak(){
        println("Hi there!")
    }
      fun speak(name:String){
        println("Hi there! $name ")
    }
}

class Employee (override val name:String,override  var age:Int):Person(name,age) {
    override fun speak(){
        println("Good morning")
    }
    fun speak(name:String){
        println("Hi $name ")
    }
}

fun main(args: Array<String>) {
    val student=Student("adam",74,55763273)
    student.speak()
    println(student.bry())
    val emp=Employee("Pete",33)
    emp.speak()
    emp.speak("Bob")
    println(emp.bry())
//
  //  val person=Person("tom",55)
}
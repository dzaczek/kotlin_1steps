package oo

/**
 * Created by dzaczek on 5/22/17.
 */
class Person{
    val name: String="Sarah"
    var age:  Int = 42

}

fun main(args: Array<String>) {
    val person1=Person()
    println(person1.age)
    println(person1.name)
}
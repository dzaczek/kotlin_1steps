package functions

import java.util.*

/**
 * Created by dzaczek on 5/21/17.
 */
fun helloword(){
    println("hellow word")
}
fun printWithSpaces(text:String){
   for (char in text){
       print(char + " ")
   }
}
fun getCurrentDate(): Date {
    return Date()
}
fun max(a:Int,n:Int):Int{
    if (a>=n){
        return a
    }else {
        return n
    }
}

fun overload(a:Int):Int{
    var b:Int=a*a
    return b
}
fun overload(a:String): String {
    var b=""
    for (char in a) {
        b = b + "$char "
    }

    return b
}
fun main(args: Array<String>) {
    helloword()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(55,2))
    println(overload(4))
    println(overload(25))
    println(overload("Dog"))
}
package conditionals
import java.util.*
/**
 * Created by dzaczek on 5/20/17.
 */
fun main(args: Array<String>) {
    var cars: Int = 151
    val parkings: Int =150
    if (cars < parkings){
        println("You can parking")

    }else if (cars==parkings) {
        print("Parking is full you can't parking ")
    }
    else {
        println("Parking is  overload You can't parking ")
    }
    println("end blocks")
    cars=2
    when (cars) {
        1-> print("Only 1 car")
        2-> {
            println("2 cars first clients ")
            println("bla bla")
        }
        3-> println("3 cars ")
        else ->  println("many cars")
    }
    val mode:Int=3
    val result= when (mode) {

        1->"value eq 1"
        2->"value eq 2"
        3-> {
            println("value eq 3")
            "return value eq 3"
        }
        4->"value 4"
        else->"just else"

    }
    println(result)
    val x=if(mode < 2)
    {
        println("print 2")
        10
    }else {
        13
    }
println(x)

    val y=5
    when (y){
     //   5 -> println("x is 5")
        2*2-> println("x is 2*2")
        "How are you".length->println("Length of string")
        in 1..10 -> println("form 1 to 10")
        in 11..20-> println("11to 20")
        in 21..30->println("21to 30")
        !in 1..9->print("not in 1 to 9")

    }


    val random = Random().nextInt(50)+1
    println("$random")
    when (random){
        in 1..10-> println("From 1 to 10")
        in 11..20-> println("From 11 to 20")
        in 21..30-> println("From 21 to 30")
        in 31..40-> println("From 31 to 40")
        else -> println("Above 40: $random")
    }

}

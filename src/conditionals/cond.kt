package conditionals

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

}

package loops

import java.util.*

/**
 * Created by dzaczek on 5/22/17.
 */

fun main(args: Array<String>) {

    var numbers= arrayListOf<Int>()
    for (i in 1..100000) {
        //Random().nextInt(50) + 1
        numbers.add(Random().nextInt(100)+1)

    }
    var start=System.nanoTime()
    val a=reverse(numbers)
    var aTime=System.nanoTime()-start

    start=System.nanoTime()
    val b=reverse2(numbers)
    var bTime=System.nanoTime()-start

    start=System.nanoTime()
    val c=reverse3(numbers)
    var cTime=System.nanoTime()-start

    println("Funcion1\tFunction2\tFunction3")
    println("$aTime\t$bTime\t$cTime")


}

fun reverse(list: List<Int>):List<Int>{
    val result = arrayListOf<Int>()
    for (i in 0..list.size-1){
        result.add(list.get(list.size-1-i))

    }
    return result
}

fun reverse2(list: List<Int>):List<Int>{
    val result= arrayListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list.get(i))
    }
    return result
}

fun reverse3(list: List<Int>):List<Int>{
    val result= arrayListOf<Int>()
    for (i in 0..list.size-1){
        result.add(0,list.get(i))
    }
    return result
}


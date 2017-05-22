package collections

/**
 * Created by dzaczek on 5/20/17.
 */
fun main(args: Array<String>) {
    var array = arrayOf("Ab", "bc", "cd")//cant add
    val list = listOf("de", "fg", "hi")//no mut abble
    val arralist = arrayListOf("pk", "pl", "p;")
    arralist.add("pa")
    val mixed = arrayOf("1", 1, "dog", 3.42, 3.147882922)
    var bunber = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(bunber[0])
    val plusplus = array + list
    println(plusplus.size)
    if (mixed.contains("dog")) {
        println("hauhau")

    } else {
        println("meumeu")
    }


    //step2
    val arraylist1 = arrayListOf("Mr", "MS")
    val arraylist2 = arrayListOf("anna", "Ewa", "marta")
    println(arraylist1)
    println(arraylist1.size)
    println(arraylist1 + arraylist2)
    println(arraylist2.add("Kate"))
    println(arraylist2)
    println(arraylist2.remove("Kate"))
    println(arraylist2)
    println(arraylist2.add(1, "Kate"))
    println(arraylist2)
    println(arraylist2.add("Kate"))
    println(arraylist2)
    println(arraylist2.remove("Kate"))
    println(arraylist2)
    val subar = arraylist2.subList(1, 2)
    println(subar)
}
package loops

/**
 * Created by dzaczek on 5/21/17.
 */
fun main(args: Array<String>) {
    var sums: Long=0
    for (i in 100..100000){
        sums+=i
    }
    println(sums)
}
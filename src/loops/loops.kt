package loops

/**
 * Created by dzaczek on 5/20/17.
 */
fun main(args: Array<String>) {
    var sum=0
    for (i in 1..1000){
        println("hello $i")
        sum=sum+i
    }
    println("Data $sum")
    var list= listOf("Java","Python","Kotlin","Bash")
    for (elements in list){
       println(elements)
    }
    for((index,value) in list.withIndex()){
        println("Element $index value $value")
                    }
// while
    var x=9
    while (x>=0) {
        println(x)
        x--
    }

    var im=1
    while(im<=10){
        println(im)
        im++
    }

    for ( c in "smaczyrabarbar"){
        if (c=='a') {
            break
        }
        print(c)

    }

    val list6= listOf("samolot","pes","Kot")
        for (str in list6){
            if(!str.contains('o')){
                continue
            }
            //?
            println(str)
        }

    for (rr3 in 1..10){
        for (t in 1..10){
            if(rr3-t==5){
                break
            }
            println("$rr3   --   $t")

        }
    }

   outer@ for (rr3 in 1..10){
        for (t in 1..10){
            if(rr3-t==5){
                break@outer
            }
            println("$rr3   --   $t")

        }
    }



}
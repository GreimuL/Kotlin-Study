import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var min:Int = Int.MAX_VALUE
    for(i in 0..2){
        val b = scanner.nextInt()
        if(b<min){
            min = b
        }
    }
    var min2:Int = Int.MAX_VALUE
    for(i in 0..1){
        val c = scanner.nextInt()
        if(c<min2){
            min2 = c
        }
    }
    println(min+min2-50)
}
import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var cost:Int = scanner.nextInt()
    var book:Int = 0
    for(i in 1..9){
        book += scanner.nextInt()
    }
    println(cost-book)
}
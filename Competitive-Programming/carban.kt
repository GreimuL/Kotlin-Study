import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    val hi = scanner.nextInt()
    var arr = IntArray(5)

    for(i in 0..4){
        arr[i] = scanner.nextInt()
    }
    var cnt:Int=0
    for(i in arr){
        if(i==hi){
            cnt++
        }
    }
    println(cnt)
}
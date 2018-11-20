import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var arr = IntArray(n)
    var maxi:Int = -1005
    var cur:Int = 0
    for(i in 0..(n-1)){
        arr[i] = scanner.nextInt()
    }
    for(i in arr){
        cur += i
        if(cur>maxi) {
            maxi = cur
        }
        if(cur<0){
            cur = 0
        }
    }
    println(maxi)
}
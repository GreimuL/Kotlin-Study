import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()
    var arr = IntArray(2)
    for(i in 0..(n-1)){
        var ck = scanner.nextInt()
        arr[ck]++
    }
    if(arr[0]>arr[1]){
        println("Junhee is not cute!")
    }
    else{
        println("Junhee is cute!")
    }
}
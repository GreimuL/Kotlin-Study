import java.util.Scanner
fun main(args:Array<String>){
    val scanner =Scanner(System.`in`)
    val n = scanner.nextInt()
    var remain = 1000-n
    var cnt:Int =0
    cnt += remain/500
    remain %= 500
    cnt += remain/100
    remain %= 100
    cnt += remain /50
    remain %= 50
    cnt += remain/10
    remain%=10
    cnt += remain/5
    remain%=5
    cnt += remain
    println(cnt)
}
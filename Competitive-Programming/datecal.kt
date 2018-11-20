import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var E:Int = scanner.nextInt()
    var S:Int = scanner.nextInt()
    var M:Int = scanner.nextInt()
    if(E == 15){
        E = 0
    }
    if(S == 28){
        S = 0
    }
    if(M == 19){
        M = 0
    }
    for(i in 1..7980){
        if(i%15==E&&i%28==S&&i%19==M){
            println(i)
            break
        }
    }
}
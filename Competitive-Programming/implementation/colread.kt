import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var str = arrayOfNulls<String>(5)
    var cnt:Int = 0
    for(i in 0..4){
        str[i] = scanner.nextLine()
        if(str[i]!!.length > cnt){
            cnt = str[i]!!.length
        }
    }
    for(i in 0..(cnt-1)){
        for(j in 0..4){
            if(i>=str[j]!!.length){
                continue
            }
            print(str[j]!![i])
        }
    }
}
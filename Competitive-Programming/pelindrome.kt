import java.util.*
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var s:String = scanner.nextLine()
    var k:Long = scanner.nextLong()
    for(i in 0..(s.length/2)){
        if(s[i]==s[s.length-1-i]){
            continue
        }
        print("NO")
        return
    }
    print("YES")
}
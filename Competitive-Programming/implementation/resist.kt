import java.util.Scanner
fun main(args:Array<String>){
    val arr = arrayOf<String>("black","brown","red","orange","yellow","green","blue","violet","grey","white")
    val scanner = Scanner(System.`in`)
    var a:String = scanner.next()
    var b:String = scanner.next()
    var c:String = scanner.next()
    var v1:Long = 0
    var v2:Long = 0
    var v3:Double = 0.0
    for(i in 0..9){
        if(a == arr[i]){
            v1 = i.toLong()
        }
        if(b == arr[i]){
            v2 = i.toLong()
        }
        if(c == arr[i]){
            v3 = Math.pow(10.0,i.toDouble())
        }
    }
    var res :Long = (v1*10+v2)*(v3.toLong())
    println(res)
}
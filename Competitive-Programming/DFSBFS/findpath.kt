import java.util.*
public var matrix = Array(105,{IntArray(105)})
fun findpath(st:Int,n:Int,dj:Int):Int{
    var queue:Queue<Int> = ArrayDeque<Int>()
    var ck = IntArray(105)
    queue.add(st)
    while(queue.peek()!=null){
        var now:Int = queue.peek()
        queue.remove()
        for(i in 0..(n-1)){
            if(ck[i]==0&&matrix[now][i] ==1){
                if(i==dj){
                    return 1
                }
                queue.add(i)
                ck[i] = 1
            }
        }
    }
    return 0
}
fun main(args:Array<String>){
    var scanner = Scanner(System.`in`)
    var n:Int = scanner.nextInt()
    for(i in 0..(n-1)){
        for(j in 0..(n-1)){
            matrix[i][j] = scanner.nextInt()
        }
    }
    for(i in 0..(n-1)){
        for(j in 0..(n-1)){
            print("${findpath(i,n,j)} ")
        }
        println()
    }
}
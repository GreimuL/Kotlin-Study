import java.util.*
var edges = Array(1005,{IntArray(1005)})
var edgeck = IntArray(1005)
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var n:Int = scanner.nextInt()
    var m:Int = scanner.nextInt()

    for(i in 0..(m-1)){
        var s = scanner.nextInt()
        var f = scanner.nextInt()
        edges[s][f] = 1
        edges[f][s] = 1
    }
    var cnt:Int =0
    for(i in 1..n){
        if(edgeck[i]==0){
            cnt++
            edgeck[i] = 1
            var queue:Queue<Int> = ArrayDeque<Int>()
            queue.add(i)
            while(queue.peek()!=null){
                var now:Int = queue.peek()
                queue.remove()
                for(j in 1..n){
                    if(edges[now][j] == 1&&edgeck[j] ==0){
                        edgeck[j] = 1
                        queue.add(j)
                    }
                }
            }
        }
    }
    print(cnt)
}
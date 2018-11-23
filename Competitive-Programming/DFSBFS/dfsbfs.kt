import java.util.*

public var arr = Array(1001,{IntArray(1001)})
public var dfsck = IntArray(1001)
public var bfsck = IntArray(1001)
fun dfs(start:Int,num:Int){
    dfsck[start] = 1
    print("$start ")
    var now:Int = start
    for(i in 1..1000){
        if(arr[now][i]==1&&dfsck[i] == 0){
            dfsck[i]  = 1
            dfs(i,num)
        }
    }
}
fun bfs(start:Int,num:Int){
    bfsck[start] =1
    var queue: Queue<Int> = ArrayDeque<Int>()
    queue.add(start)
    print("$start ")
    while(queue.peek()!=null){
        var now = queue.peek()
        queue.remove()
        for(i in 1..1000){
            if(arr[now][i] == 1&&bfsck[i] == 0){
                bfsck[i] = 1
                queue.add(i)
                print("$i ")
            }
        }
    }
}
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val v = scanner.nextInt()


    for(i in 1..m){
        var st = scanner.nextInt()
        var fi = scanner.nextInt()
        arr[st][fi] = 1
        arr[fi][st] = 1
    }
    dfs(v,n)
    println()
    bfs(v,n)
}
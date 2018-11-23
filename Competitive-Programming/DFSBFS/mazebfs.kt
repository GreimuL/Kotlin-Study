import java.util.*

public var graph = Array(105,{IntArray(105)})
public var visck = Array(105,{IntArray(105)})
public var dx = arrayOf<Int>(0,0,1,-1)
public var dy = arrayOf<Int>(1,-1,0,0)
public var n:Int = 0
public var m:Int = 0
fun mbfs(x:Int,y:Int){
    var queueX:Queue<Int> = ArrayDeque<Int>()
    var queueY:Queue<Int> = ArrayDeque<Int>()
    var depth:Queue<Int> = ArrayDeque<Int>()
    queueX.add(x)
    queueY.add(y)
    depth.add(1)
    while(queueX.peek()!=null){
        var nowx:Int = queueX.peek()
        var nowy:Int = queueY.peek()
        var nowd:Int = depth.peek()
        queueX.remove()
        queueY.remove()
        depth.remove()
        if(nowx ==n-1&&nowy == m-1){
            println(nowd)
            return
        }
        for(i in 0..3){
            var nex:Int = nowx+dx[i]
            var ney:Int = nowy+dy[i]
            if(nex<0||nex>=n||ney<0||ney>=m){
                continue
            }
            if(visck[nex][ney]==0&&graph[nex][ney] == 1){
                visck[nex][ney] = 1
                queueX.add(nex)
                queueY.add(ney)
                depth.add(nowd+1)
            }
        }
    }
}
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    n = scanner.nextInt()
    m = scanner.nextInt()
    var buffer = scanner.nextLine()
    for(i in 0..(n-1)){
        var str:String = scanner.nextLine()
        for(j in 0..(str.length-1)) {
            graph[i][j] = (str[j] - '0').toInt()
        }
    }
    mbfs(0,0)
}
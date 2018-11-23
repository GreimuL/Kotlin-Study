import java.util.*
var rgb = Array(105,{IntArray(105)})
var rgb2 = Array(105,{IntArray(105)})
var rgbck = Array(105,{IntArray(105)})
var rgb2ck = Array(105,{IntArray(105)})
var rx = arrayOf(0,0,-1,1)
var ry = arrayOf(1,-1,0,0)
var rgbn:Int =0
fun rgbbfs(si:Int,sj:Int,col:Int){
    var queueX:Queue<Int> = ArrayDeque<Int>()
    var queueY:Queue<Int> = ArrayDeque<Int>()
    queueX.add(si)
    queueY.add(sj)
    rgbck[si][sj] = 1
    while(queueX.peek()!=null){
        var nowx = queueX.peek()
        var nowy = queueY.peek()
        queueX.remove()
        queueY.remove()
        for(i in 0..3){
            var nex = nowx+rx[i]
            var ney = nowy+ry[i]
            if(nex<0||nex>=rgbn||ney<0||ney>=rgbn){
                continue
            }
            if(rgbck[nex][ney] ==0&&rgb[nex][ney]==col){
                queueX.add(nex)
                queueY.add(ney)
                rgbck[nex][ney] = 1
            }
        }
    }
}
fun rgbbfs2(si:Int,sj:Int,col:Int){
    var queueX:Queue<Int> = ArrayDeque<Int>()
    var queueY:Queue<Int> = ArrayDeque<Int>()
    queueX.add(si)
    queueY.add(sj)
    rgb2ck[si][sj] = 1
    while(queueX.peek()!=null){
        var nowx = queueX.peek()
        var nowy = queueY.peek()
        queueX.remove()
        queueY.remove()
        for(i in 0..3){
            var nex = nowx+rx[i]
            var ney = nowy+ry[i]
            if(nex<0||nex>=rgbn||ney<0||ney>=rgbn){
                continue
            }
            if(rgb2ck[nex][ney] ==0&&rgb2[nex][ney]==col){
                queueX.add(nex)
                queueY.add(ney)
                rgb2ck[nex][ney] = 1
            }
        }
    }
}
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    rgbn = scanner.nextInt()
    var buffer = scanner.nextLine()

    for(i in 0..(rgbn-1)){
        var str = scanner.nextLine()
        for(j in 0..(str.length-1)){
            if(str[j] == 'R'){
                rgb[i][j] = 1
                rgb2[i][j] = 1
            }
            else if(str[j] == 'G'){
                rgb[i][j] =2
                rgb2[i][j] = 1
            }
            else{
                rgb[i][j] = 3
                rgb2[i][j] =3
            }
        }
    }
    var cnt:Int =0
    for(i in 0..(rgbn-1)){
        for(j in 0..(rgbn-1)){
            if(rgbck[i][j]==0) {
                cnt++
                rgbbfs(i, j, rgb[i][j])
            }
        }
    }
    var cnt2:Int =0
    for(i in 0..(rgbn-1)){
        for(j in 0..(rgbn-1)){
            if(rgb2ck[i][j]==0) {
                cnt2++
                rgbbfs2(i, j, rgb2[i][j])
            }
        }
    }
    print("$cnt $cnt2")
}
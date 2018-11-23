import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    var n:Int = scanner.nextInt()
    var k:Int = scanner.nextInt()

    var arr = IntArray(n+1)
    var cnt:Int =0
    while(true){
        var pivot:Int =0
        for(i in 2..n){
            if(arr[i] != 1){
                pivot = i;
                break;
            }
        }
        var del:Int = 1
        del *= pivot
        while(del<=n){
            if(arr[del]==1){
                del += pivot
                continue
            }
            arr[del] = 1
            cnt++
            if(cnt==k){
                println(del)
                break
            }
            del += pivot
        }
        if(cnt==k){
            break
        }
    }
}
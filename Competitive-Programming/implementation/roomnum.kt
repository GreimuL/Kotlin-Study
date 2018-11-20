import java.util.Scanner
fun main(args:Array<String>){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine()
    var num = IntArray(10)
    for(i in n){
        num[i-'0']++
    }
    var cnt:Int =0
    for(i in 0..9){
        if(i == 6){
            num[9] += num[6]
            continue
        }
        if(i==9){
            if((cnt*2)>=num[i]){
                continue
            }
            else{
                num[i] -= cnt*2
                if(num[i]%2==0){
                    cnt += num[i]/2
                }
                else{
                    cnt += num[i]/2 +1
                }
                continue
            }
        }
        if(cnt >=num[i]){
            continue
        }
        else{
            cnt += num[i]-cnt
        }
    }
    println(cnt)
}
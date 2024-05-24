import kotlin.math.abs
import kotlin.math.min
class ClearFunc {

    //Функция высшего порядка для обработки цифр числа
    private fun cycleDigitHighOrder(n:Int,initResult: Int,stopCondFunc:(Int)->Boolean,processFunc:(Int,Int)->Int):Int {
        var currentN = abs(n)
        var result = initResult
        while(stopCondFunc(currentN)){
            result = processFunc(result,currentN%10)
            currentN /= 10
        }
        return result
    }


    //нахождение минимальной цифры числа
    fun minDigit(n:Int):Int = cycleDigitHighOrder(n, n%10, {k:Int -> k>0}, {k:Int, m:Int -> min(k,m)})

    //нахождение количества цифр числа меньших 3
    fun countLess3(n:Int):Int = cycleDigitHighOrder(n, 0, {k:Int -> k>0}, {k:Int, m:Int -> if(m<3) k+1 else k})

    //Функция высшего порядка для обработки делителей
    private fun cycleDividers(n:Int,initResult:Int,stopCondFunc:(Int,Int)->Boolean,processFunc:(Int,Int,Int)->Int):Int {
        if (n==0) return 0
        val currentN = abs(n)
        var currentDivider = 1
        var result = initResult
        while(stopCondFunc(currentN,currentDivider)){
            result = processFunc(currentN,currentDivider,result)
            currentDivider+=1
        }
        return result
    }

    //нахождение количества делителей числа
    fun countDividers(n:Int):Int = cycleDividers(n, 0, {k:Int, m:Int -> m<=k}, {k:Int, m:Int, l:Int -> if(k%m==0) l+1 else l})

}

fun main() {
    val clearFunc = ClearFunc()
    println(clearFunc.minDigit(991234789))
    println(clearFunc.countLess3(991234789))
    println(clearFunc.countDividers(991234789))
}
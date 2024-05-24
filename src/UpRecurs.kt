import kotlin.math.abs
import kotlin.math.min
class UpRecurs {

    //Функция высшего порядка для обработки цифр числа
    fun digitsRec (n: Int,initResult:Int,condStop:(Int)->Boolean,processFunc:(Int,Int)->Int):Int =
        if (condStop(n)) initResult else processFunc(abs(n) % 10, digitsRec(n / 10, initResult, condStop, processFunc))

    //нахождение минимальной цифры числа
    fun minDigit(n:Int):Int = digitsRec(n, n%10, {k:Int -> k>0}, {k:Int, m:Int -> min(k,m)})

    //нахождение количества цифр числа меньших 3
    fun countLess3(n:Int):Int = digitsRec(n, 0, {k:Int -> k>0}, {k:Int, m:Int -> if(m<3) k+1 else k})

    //Функция высшего порядка для обработки делителей
    private fun dividersRec(n:Int, initResult: Int,currentDiv: Int, condStop: (Int, Int) -> Boolean, processFunc: (Int, Int, Int) -> Int):Int =
        if(condStop(n,currentDiv))initResult else processFunc(n,currentDiv,dividersRec(n,initResult,currentDiv+1,condStop,processFunc))


    //нахождение количества делителей числа
    fun countDividers(n:Int):Int = dividersRec(n, 0, 1, {k:Int, m:Int -> m<=k}, {k:Int, m:Int, l:Int -> if(k%m==0) l+1 else l})


}

fun main() {
    val clearFunc = ClearFunc()
    println(clearFunc.minDigit(991234789))
    println(clearFunc.countLess3(991234789))
    println(clearFunc.countDividers(991234789))
}
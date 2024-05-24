import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class countLess3Test {

    @Test
    fun countLess3TestPos() {
        val cycFuncs = ClearFunc()
        Assertions.assertEquals(2, cycFuncs.countLess3(991234789))
    }

    @Test
    fun countLess3TestNeg() {
        val cycFuncs = ClearFunc()
        Assertions.assertEquals(2, cycFuncs.countLess3(-991234789))
    }

    @Test
    fun countLess3TestZero() {
        val cycFuncs = ClearFunc()
        Assertions.assertEquals(0, cycFuncs.countLess3(0))
    }

    @Test
    fun upReccountLess3TestPos() {
        val cycFuncs = UpRecurs()
        Assertions.assertEquals(2, cycFuncs.countLess3(991234789))
    }

    @Test
    fun upReccountLess3TestNeg() {
        val cycFuncs = UpRecurs()
        Assertions.assertEquals(2, cycFuncs.countLess3(-991234789))
    }

    @Test
    fun upReccountLess3TestZero() {
        val cycFuncs = UpRecurs()
        Assertions.assertEquals(0, cycFuncs.countLess3(0))
    }

    @Test
    fun downReccountLess3TestPos() {
        val cycFuncs = DownRec()
        Assertions.assertEquals(2, cycFuncs.countLess3(991234789))
    }

    @Test
    fun downReccountLess3TestNeg() {
        val cycFuncs = DownRec()
        Assertions.assertEquals(2, cycFuncs.countLess3(-991234789))
    }

    @Test
    fun downReccountLess3TestZero() {
        val cycFuncs = DownRec()
        Assertions.assertEquals(0, cycFuncs.countLess3(0))
    }

}
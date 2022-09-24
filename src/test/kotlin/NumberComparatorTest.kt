import org.jetbrains.annotations.TestOnly
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberComparatorTest {
    @Test
    fun fiveThreeOneIsEnteredReturnFive(){
        var numberComparator = NumberComparator()
        assertEquals(5,numberComparator.getMaxNumber(5,3,1))
    }
    @Test
    fun oneFiveTwoIsEnteredReturnFive(){
        var numberComparator = NumberComparator()
            assertEquals(5,numberComparator.getMaxNumber(1,5,2))
    }
    @Test
    fun twoFiveSevenIsEnteredReturnSeven(){
        var numberComparator = NumberComparator()
        assertEquals(7 ,numberComparator.getMaxNumber(2,5,7))
    }
}


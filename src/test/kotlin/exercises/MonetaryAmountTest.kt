package exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MonetaryAmountTest {
    @Test
    fun fiveThreeOneIsEnteredReturnFive(){
        var numberComparator = NumberComparator()
        assertEquals(5,numberComparator.getMaxNumber(5,3,1))
    }
}
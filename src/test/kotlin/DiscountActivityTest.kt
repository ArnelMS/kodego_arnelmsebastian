package practice_activities

import DiscountActivity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DiscountActivityTest {
    @Test
    fun inputIsGreaterThanZeroLessThanTenThousand() {
        var dActivity = DiscountActivity("router", 5000.00)
        assertEquals(0.0, dActivity.getDiscountedCost(5000.00))

    }

    @Test
    fun inputIsGreaterThanTenThousand() {
        var dActivity = DiscountActivity("router", 15000.00)
        assertEquals(750.0, dActivity.getDiscountedCost(15000.00))

    }

    @Test
    fun inputIsGreaterTwentyThousand() {
        var dActivity = DiscountActivity("router", 25000.00)
        assertEquals(2500.00, dActivity.getDiscountedCost(25000.00))

    }

    @Test
    fun inputIsGreaterFiftyThousand() {
        var dActivity = DiscountActivity("router", 70000.00)
        assertEquals(10500.00, dActivity.getDiscountedCost(70000.00))

    }


    @Test
    fun inputIsGreaterOneHundredThousand() {
        var dActivity = DiscountActivity("router", 120000.00)
        assertEquals(24000.00, dActivity.getDiscountedCost(120000.00))

    }

}
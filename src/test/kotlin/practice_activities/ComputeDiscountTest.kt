package practice_activities

import ComputeDiscount
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ComputeDiscountTest {
    // Test Cases

    // (1) 0=>price<=10000  is entered, it will return 0
    @Test
    fun priceGreaterThanOrEqualZeroLessThanOrEqualTenThousand() {
        var discountedPrice = ComputeDiscount()
        assertEquals("0%",discountedPrice.getPrice(9999.0))
    }

    // (2) 10001=>price<=20000  is entered, it will return 5% discount price
    @Test
    fun priceGreaterThanOrEqualTenThousandOneLessThanOrEqualTwentyThousand() {
        var discountedPrice = ComputeDiscount()
        assertEquals("5%",discountedPrice.getPrice(10001.0))
    }

    // (3) 20001=>price<=50000  is entered, it will return 10% discount price
    @Test
    fun priceGreaterThanOrEqualTwentyThousandOneLessThanOrEqualFiftyThousand() {
        var discountedPrice = ComputeDiscount()
        assertEquals("10%",discountedPrice.getPrice(20001.0))
    }

    // (4) 50001=>price<=100000  is entered, it will return 15% discount price
    @Test
    fun priceGreaterThanOrEqualFiftyThousandOneLessThanOrEqualOneHundredThousand() {
        var discountedPrice = ComputeDiscount()
        assertEquals("15%",discountedPrice.getPrice(50001.0))
    }

    // (5) price>100000  is entered, it will return 20% discount price
    @Test
    fun priceGreaterThanOneHundredThousand() {
        var discountedPrice = ComputeDiscount()
        assertEquals("20%",discountedPrice.getPrice(100001.0))
    }

}

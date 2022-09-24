import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


internal class NumberComparatorTest {

    // Test Cases

    // (1) 5,3,1 is entered, it will return 5
    @Test
    fun fiveThreeOneIsEnteredReturnFive() {
        var numComparator = NumberComparator()
        assertEquals(5,numComparator.getMaxNumber(5,3,1))
    }

    // (2) 1,5,2 is entered, it will return 5
    @Test
    fun oneFiveTwoIsEnteredReturnFive() {
        var numComparator = NumberComparator()
        assertEquals(5,numComparator.getMaxNumber(1,5,2))
    }

    // (3) 2,5,7 is entered, it will return 7
    @Test
    fun twoFiveSevenIsEnteredReturnSeven() {
        var numComparator = NumberComparator()
        assertEquals(7,numComparator.getMaxNumber(2,5,7))
    }

}
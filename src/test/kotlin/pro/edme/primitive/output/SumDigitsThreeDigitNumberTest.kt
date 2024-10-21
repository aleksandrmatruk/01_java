package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumDigitsThreeDigitNumberTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = 15
        assertEquals(SumDigitsThreeDigitNumber.sumDigitsInNumber(546), correctValue)
    }
}
package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOfTwoNumbersTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = -10
        assertEquals(MinimumOfTwoNumbers.min(-10, -20), correctValue)
    }
}
package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumbersSumTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = 4
        assertEquals(NumbersSum.sum(2, 2), correctValue)
    }
}
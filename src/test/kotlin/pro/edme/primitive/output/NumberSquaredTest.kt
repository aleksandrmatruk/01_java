package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberSquaredTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = 25
        assertEquals(NumberSquared.sqr(5), correctValue)
    }
}
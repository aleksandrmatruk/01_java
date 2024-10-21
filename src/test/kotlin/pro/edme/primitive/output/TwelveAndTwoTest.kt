package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwelveAndTwoTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "12 и 2"
        assertEquals(TwelveAndTwo.getTwelveAndTwo(), correctValue)
    }
}
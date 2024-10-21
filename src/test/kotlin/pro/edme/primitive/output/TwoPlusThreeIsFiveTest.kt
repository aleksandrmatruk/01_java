package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoPlusThreeIsFiveTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "2 плюс 3 равно 5"
        assertEquals(TwoPlusThreeIsFive.getText(), correctValue)
    }
}
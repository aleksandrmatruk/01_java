package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumOfFourNumbersTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            MaximumOfFourNumbers.getMaxOfFour(2, 3, 4, 5),
            5
        )

        assertEquals(
            MaximumOfFourNumbers.getMaxOfFour(5, 5, 5, 5),
            5
        )
    }
}
package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeNumbersTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            ThreeNumbers.getDifferentNumber(4, 6, 6),
            1
        )

        assertEquals(
            ThreeNumbers.getDifferentNumber(4, 5, 6),
            0
        )
    }
}
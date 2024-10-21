package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SortingThreeNumbersTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            SortingThreeNumbers.sort(2, 3, 4).trim(),
            "4 3 2"
        )
    }
}
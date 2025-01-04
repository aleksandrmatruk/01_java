package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class SortingThreeNumbersTest {
    @Test
    fun `Function sort() must return correct value`() {
        SortingThreeNumbers.sort(2, 3, 4).assertTrimmedEqualsIgnoreCase("4 3 2")
    }
}
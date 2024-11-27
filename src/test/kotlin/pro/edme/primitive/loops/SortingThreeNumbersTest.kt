package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SortingThreeNumbersTest {
    @Test
    fun `Function sort() must return correct value`() {
        assertThat(SortingThreeNumbers.sort(2, 3, 4).trim()).isEqualTo("4 3 2")
    }
}
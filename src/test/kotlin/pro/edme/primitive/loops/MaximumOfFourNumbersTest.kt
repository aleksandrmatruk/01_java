package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumOfFourNumbersTest {
    @Test
    fun `Function getMaxOfFour() must return correct value`() {
        assertThat(MaximumOfFourNumbers.getMaxOfFour(2, 3, 4, 5)).isEqualTo(5)
        assertThat(MaximumOfFourNumbers.getMaxOfFour(5, 5, 5, 5)).isEqualTo(5)
    }
}
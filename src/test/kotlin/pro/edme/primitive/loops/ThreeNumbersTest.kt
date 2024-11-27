package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeNumbersTest {
    @Test
    fun `Function must return correct value`() {
        assertThat(ThreeNumbers.getDifferentNumber(4, 6, 6)).isEqualTo(1)
        assertThat(ThreeNumbers.getDifferentNumber(4, 5, 6)).isEqualTo(0)
    }
}
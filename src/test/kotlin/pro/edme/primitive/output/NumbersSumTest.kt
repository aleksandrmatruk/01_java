package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumbersSumTest {
    @Test
    fun `Function sum() must return correct value`() {
        assertThat(NumbersSum.sum(2, 2)).isEqualTo(4)
    }
}
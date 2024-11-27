package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumOfTwoNumbersTest {
    @Test
    fun `Function min() must return correct value`() {
        assertThat(MinimumOfTwoNumbers.min(-10, -20)).isEqualTo(-20)
    }
}
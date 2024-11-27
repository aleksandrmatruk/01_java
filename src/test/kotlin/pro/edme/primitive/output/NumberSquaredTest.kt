package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberSquaredTest {
    @Test
    fun `Function must return correct value`() {
        assertThat(NumberSquared.sqr(5)).isEqualTo(25)
    }
}
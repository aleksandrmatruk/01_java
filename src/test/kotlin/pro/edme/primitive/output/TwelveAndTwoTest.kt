package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwelveAndTwoTest {
    @Test
    fun `Function getTwelveAndTwo() must return correct value`() {
        assertThat(TwelveAndTwo.getTwelveAndTwo().trim()).isEqualTo("12 и 2")
    }
}
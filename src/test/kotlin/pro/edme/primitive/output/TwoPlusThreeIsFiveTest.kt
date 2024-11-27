package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoPlusThreeIsFiveTest {
    @Test
    fun `Function getText() must return correct value`() {
        assertThat(TwoPlusThreeIsFive.getText()).isEqualToIgnoringCase("2 плюс 3 равно 5")
    }
}
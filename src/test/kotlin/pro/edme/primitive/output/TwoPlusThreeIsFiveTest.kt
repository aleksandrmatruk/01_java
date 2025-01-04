package pro.edme.primitive.output

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class TwoPlusThreeIsFiveTest {
    @Test
    fun `Function getText() must return correct value`() {
        TwoPlusThreeIsFive.getText().assertTrimmedEqualsIgnoreCase("2 плюс 3 равно 5")
    }
}
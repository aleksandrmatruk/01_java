package pro.edme.primitive.output

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class TwelveAndTwoTest {
    @Test
    fun `Function getTwelveAndTwo() must return correct value`() {
        TwelveAndTwo.getTwelveAndTwo().assertTrimmedEqualsIgnoreCase("12 и 2")
    }
}
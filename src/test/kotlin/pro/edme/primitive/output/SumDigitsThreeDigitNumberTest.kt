package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SumDigitsThreeDigitNumberTest {
    @Test
    fun `Function sumDigitsInNumber() must return correct value`() {
        assertThat(SumDigitsThreeDigitNumber.sumDigitsInNumber(546)).isEqualTo(15)
    }
}
package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FirstConverterTest {
    @Test
    fun `Function convertCelsiusToFahrenheit() must return correct value`() {
        assertThat(FirstConverter.convertCelsiusToFahrenheit(41)).isEqualTo(105.8)
    }
}
package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstConverterTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = 105.8
        assertEquals(FirstConverter.convertCelsiusToFahrenheit(41), correctValue)
    }
}
package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FillingPoolWithWaterTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = 250_000
        assertEquals(FillingPoolWithWater.getVolume(25, 5, 2), correctValue)
    }
}
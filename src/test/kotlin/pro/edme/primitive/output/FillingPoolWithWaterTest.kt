package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FillingPoolWithWaterTest {
    @Test
    fun `Function getVolume() must return correct value`() {
        assertThat(FillingPoolWithWater.getVolume(25, 5, 2)).isEqualTo(250_000)
    }
}
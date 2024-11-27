package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HitOrMissTest {
    @Test
    fun `Function checkInterval() must return correct value`() {
        val correctValue = "Число 345 не содержится в интервале."
        assertThat(HitOrMiss.checkInterval(345)).isEqualTo(correctValue)
    }
}
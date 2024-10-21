package pro.edme.primitive.loops

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HitOrMissTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "Число 345 не содержится в интервале."
        assertEquals(HitOrMiss.checkInterval(345), correctValue)
    }
}
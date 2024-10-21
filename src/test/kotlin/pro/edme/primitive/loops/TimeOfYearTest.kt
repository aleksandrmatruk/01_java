package pro.edme.primitive.loops

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeOfYearTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "зима"
        assertEquals(TimeOfYear.checkSeason(2), correctValue)
    }
}
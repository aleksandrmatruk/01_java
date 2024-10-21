package pro.edme.primitive.loops

import org.apache.commons.lang3.StringUtils.equalsIgnoreCase
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayOfWeekTest {
    @Test
    fun `Function must return correct value`() {
        assertTrue(
            equalsIgnoreCase(
                DayOfWeek.checkDay(5).trim(),
                "пятница"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                DayOfWeek.checkDay(10).trim(),
                "такого дня недели не существует"
            )
        )
    }
}
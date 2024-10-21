package pro.edme.primitive.loops

import org.apache.commons.lang3.StringUtils.equalsIgnoreCase
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class NumberDaysInYearTest {
    @Test
    fun `Function must return correct value`() {
        assertTrue(
            equalsIgnoreCase(
                NumberDaysInYear.checkDayInYear(2300).trim(),
                "количество дней в году: 365"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                NumberDaysInYear.checkDayInYear(2000).trim(),
                "количество дней в году: 366"
            )
        )
    }
}
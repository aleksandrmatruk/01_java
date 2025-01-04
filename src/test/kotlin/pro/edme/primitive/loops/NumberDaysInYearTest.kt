package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class NumberDaysInYearTest {
    companion object {
        private const val LEAP_YEAR = "Количество дней в году: 366"
        private const val NOT_LEAP_YEAR = "Количество дней в году: 365"
    }

    @Test
    fun `Function checkDayInYear() must return correct value`() {
        NumberDaysInYear.checkDayInYear(2000).assertTrimmedEqualsIgnoreCase(LEAP_YEAR)
        NumberDaysInYear.checkDayInYear(2024).assertTrimmedEqualsIgnoreCase(LEAP_YEAR)
        NumberDaysInYear.checkDayInYear(2025).assertTrimmedEqualsIgnoreCase(NOT_LEAP_YEAR)
        NumberDaysInYear.checkDayInYear(2300).assertTrimmedEqualsIgnoreCase(NOT_LEAP_YEAR)
    }
}
package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberDaysInYearTest {
    @Test
    fun `Function checkDayInYear() must return correct value`() {
        assertThat(NumberDaysInYear.checkDayInYear(2300).trim()).isEqualToIgnoringCase("количество дней в году: 365")
        assertThat(NumberDaysInYear.checkDayInYear(2000).trim()).isEqualToIgnoringCase("количество дней в году: 366")
    }
}
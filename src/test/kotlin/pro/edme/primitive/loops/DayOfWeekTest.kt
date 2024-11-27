package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DayOfWeekTest {
    @Test
    fun `Function checkDay() must return correct value`() {
        assertThat(DayOfWeek.checkDay(5).trim()).isEqualToIgnoringCase("пятница")
        assertThat(DayOfWeek.checkDay(10).trim()).isEqualToIgnoringCase("такого дня недели не существует")
    }
}
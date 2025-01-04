package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class DayOfWeekTest {
    companion object {
        private const val MONDAY = "Понедельник"
        private const val TUESDAY = "Вторник"
        private const val WEDNESDAY = "Среда"
        private const val THURSDAY = "Четверг"
        private const val FRIDAY = "Пятница"
        private const val SATURDAY = "Суббота"
        private const val SUNDAY = "Воскресенье"
        private const val ERROR_MSG = "Такого дня недели не существует"
    }
    @Test
    fun `Function checkDay() must return correct value`() {
        DayOfWeek.checkDay(1).assertTrimmedEqualsIgnoreCase(MONDAY)
        DayOfWeek.checkDay(2).assertTrimmedEqualsIgnoreCase(TUESDAY)
        DayOfWeek.checkDay(3).assertTrimmedEqualsIgnoreCase(WEDNESDAY)
        DayOfWeek.checkDay(4).assertTrimmedEqualsIgnoreCase(THURSDAY)
        DayOfWeek.checkDay(5).assertTrimmedEqualsIgnoreCase(FRIDAY)
        DayOfWeek.checkDay(6).assertTrimmedEqualsIgnoreCase(SATURDAY)
        DayOfWeek.checkDay(7).assertTrimmedEqualsIgnoreCase(SUNDAY)
        DayOfWeek.checkDay(0).assertTrimmedEqualsIgnoreCase(ERROR_MSG)
    }
}
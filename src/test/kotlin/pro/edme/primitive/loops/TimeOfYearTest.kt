package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class TimeOfYearTest {
    companion object {
        private const val WINTER = "Зима"
        private const val SPRING = "Весна"
        private const val SUMMER = "Лето"
        private const val AUTUMN = "Осень"
        private const val ERROR = "Ошибка: Нет такого месяца!"
    }

    @Test
    fun `Function checkSeason() must return correct value`() {
        TimeOfYear.checkSeason(12).assertTrimmedEqualsIgnoreCase(WINTER)
        TimeOfYear.checkSeason(1).assertTrimmedEqualsIgnoreCase(WINTER)
        TimeOfYear.checkSeason(2).assertTrimmedEqualsIgnoreCase(WINTER)

        TimeOfYear.checkSeason(3).assertTrimmedEqualsIgnoreCase(SPRING)
        TimeOfYear.checkSeason(4).assertTrimmedEqualsIgnoreCase(SPRING)
        TimeOfYear.checkSeason(5).assertTrimmedEqualsIgnoreCase(SPRING)

        TimeOfYear.checkSeason(6).assertTrimmedEqualsIgnoreCase(SUMMER)
        TimeOfYear.checkSeason(7).assertTrimmedEqualsIgnoreCase(SUMMER)
        TimeOfYear.checkSeason(8).assertTrimmedEqualsIgnoreCase(SUMMER)

        TimeOfYear.checkSeason(9).assertTrimmedEqualsIgnoreCase(AUTUMN)
        TimeOfYear.checkSeason(10).assertTrimmedEqualsIgnoreCase(AUTUMN)
        TimeOfYear.checkSeason(11).assertTrimmedEqualsIgnoreCase(AUTUMN)

        TimeOfYear.checkSeason(0).assertTrimmedEqualsIgnoreCase(ERROR)
    }
}
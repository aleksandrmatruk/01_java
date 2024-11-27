package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TimeOfYearTest {
    @Test
    fun `Function checkSeason() must return correct value`() {
        assertThat(TimeOfYear.checkSeason(2).trim()).isEqualToIgnoringCase("зима")
    }
}
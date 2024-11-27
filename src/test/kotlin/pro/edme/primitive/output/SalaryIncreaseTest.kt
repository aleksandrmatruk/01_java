package pro.edme.primitive.output

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SalaryIncreaseTest {
    @Test
    fun `Function hackSalary() must return correct value`() {
        assertThat(SalaryIncrease.hackSalary(700).trim()).isEqualToIgnoringCase("Твоя зарплата составляет: 800 долларов в месяц.")
    }
}
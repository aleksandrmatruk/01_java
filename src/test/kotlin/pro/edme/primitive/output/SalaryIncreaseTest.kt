package pro.edme.primitive.output

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class SalaryIncreaseTest {
    companion object {
        private const val MSG = "Твоя зарплата составляет: %s долларов в месяц."
    }

    @Test
    fun `Function hackSalary() must return correct value`() {
        "700".let { expected -> SalaryIncrease.hackSalary(expected.toInt()).assertTrimmedEqualsIgnoreCase(MSG.format(expected)) }
    }
}
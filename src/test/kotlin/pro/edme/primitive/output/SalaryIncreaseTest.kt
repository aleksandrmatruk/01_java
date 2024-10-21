package pro.edme.primitive.output

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SalaryIncreaseTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "Твоя зарплата составляет: 800 долларов в месяц."
        assertEquals(SalaryIncrease.hackSalary(700), correctValue)
    }
}
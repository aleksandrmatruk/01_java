package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LabelsAndNumbersTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            LabelsAndNumbers.getText(-100),
            "отрицательное четное число"
        )
        assertEquals(
            LabelsAndNumbers.getText(100),
            "положительное четное число"
        )

        assertEquals(
            LabelsAndNumbers.getText(-51),
            "отрицательное нечетное число"
        )

        assertEquals(
            LabelsAndNumbers.getText(51),
            "положительное нечетное число"
        )

        assertEquals(
            LabelsAndNumbers.getText(0),
            "ноль"
        )
    }
}
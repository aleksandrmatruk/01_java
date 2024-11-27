package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LabelsAndNumbersTest {
    @Test
    fun `Function getText() must return correct value`() {
        assertThat(LabelsAndNumbers.getText(-100).trim()).isEqualToIgnoringCase("отрицательное четное число")
        assertThat(LabelsAndNumbers.getText(100).trim()).isEqualToIgnoringCase("положительное четное число")
        assertThat(LabelsAndNumbers.getText(-51).trim()).isEqualToIgnoringCase("отрицательное нечетное число")
        assertThat(LabelsAndNumbers.getText(51).trim()).isEqualToIgnoringCase("положительное нечетное число")
        assertThat(LabelsAndNumbers.getText(0).trim()).isEqualToIgnoringCase("ноль")
    }
}
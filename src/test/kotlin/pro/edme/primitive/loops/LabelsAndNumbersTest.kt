package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase
import java.math.BigInteger

class LabelsAndNumbersTest {
    companion object {
        private const val POSITIVE_EVEN = "Положительное четное число"
        private const val POSITIVE_ODD = "Положительное нечетное число"
        private const val NEGATIVE_EVEN = "Отрицательное четное число"
        private const val NEGATIVE_ODD = "Отрицательное нечетное число"
        private const val ZERO = "Ноль"
    }
    @Test
    fun `Function getText() must return correct value`() {
        LabelsAndNumbers.getLabelByNumber(BigInteger.ZERO).assertTrimmedEqualsIgnoreCase(ZERO)

        LabelsAndNumbers.getLabelByNumber(BigInteger.ONE).assertTrimmedEqualsIgnoreCase(POSITIVE_ODD)
        LabelsAndNumbers.getLabelByNumber(BigInteger("51")).assertTrimmedEqualsIgnoreCase(POSITIVE_ODD)

        LabelsAndNumbers.getLabelByNumber(BigInteger("100")).assertTrimmedEqualsIgnoreCase(POSITIVE_EVEN)
        LabelsAndNumbers.getLabelByNumber(BigInteger.TWO).assertTrimmedEqualsIgnoreCase(POSITIVE_EVEN)
        LabelsAndNumbers.getLabelByNumber(BigInteger.TEN).assertTrimmedEqualsIgnoreCase(POSITIVE_EVEN)

        LabelsAndNumbers.getLabelByNumber(BigInteger("-51")).assertTrimmedEqualsIgnoreCase(NEGATIVE_ODD)

        LabelsAndNumbers.getLabelByNumber(BigInteger("-100")).assertTrimmedEqualsIgnoreCase(NEGATIVE_EVEN)
    }
}
package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class HitOrMissTest {
    companion object {
        private const val CONTAINS_MSG = "Число %s содержится в интервале."
        private const val NOT_CONTAINS_MSG = "Число %s не содержится в интервале."
    }

    @Test
    fun `Function checkInterval() must return correct value`() {
        "49".let { expected -> HitOrMiss.checkInterval(expected.toInt()).assertTrimmedEqualsIgnoreCase(NOT_CONTAINS_MSG.format(expected)) }
        "50".let { expected -> HitOrMiss.checkInterval(expected.toInt()).assertTrimmedEqualsIgnoreCase(CONTAINS_MSG.format(expected)) }
        "100".let { expected -> HitOrMiss.checkInterval(expected.toInt()).assertTrimmedEqualsIgnoreCase(CONTAINS_MSG.format(expected)) }
        "101".let { expected -> HitOrMiss.checkInterval(expected.toInt()).assertTrimmedEqualsIgnoreCase(NOT_CONTAINS_MSG.format(expected)) }
        "345".let { expected -> HitOrMiss.checkInterval(expected.toInt()).assertTrimmedEqualsIgnoreCase(NOT_CONTAINS_MSG.format(expected)) }
    }
}
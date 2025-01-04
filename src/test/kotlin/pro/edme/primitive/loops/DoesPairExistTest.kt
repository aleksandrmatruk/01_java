package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class DoesPairExistTest {
    @Test
    fun `Function checkPair() must return correct value`() {
        DoesPairExist.checkPair(2, 2, 2).assertTrimmedEqualsIgnoreCase("2 2 2")
        DoesPairExist.checkPair(1, 2, 2).assertTrimmedEqualsIgnoreCase("2 2")
        DoesPairExist.checkPair(1, 2, 3).assertTrimmedEqualsIgnoreCase("")
    }
}
package pro.edme.primitive.loops

import org.apache.commons.lang3.StringUtils.equalsIgnoreCase
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DoesPairExistTest {
    @Test
    fun `Function must return correct value`() {
        assertTrue(
            equalsIgnoreCase(
                DoesPairExist.checkPair(2, 2, 2),
                "2 2 2"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                DoesPairExist.checkPair(1, 2, 2),
                "2 2"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                DoesPairExist.checkPair(1, 2, 3),
                ""
            )
        )
    }
}
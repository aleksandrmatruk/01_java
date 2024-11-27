package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DoesPairExistTest {
    @Test
    fun `Function checkPair() must return correct value`() {
        assertThat(DoesPairExist.checkPair(2, 2, 2)).isEqualTo("2 2 2")
        assertThat(DoesPairExist.checkPair(1, 2, 2)).isEqualTo("2 2")
        assertThat(DoesPairExist.checkPair(1, 2, 3)).isEqualTo("")
    }
}
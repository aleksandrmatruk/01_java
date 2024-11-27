package pro.edme.primitive.input

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTakeOverTheWorldTest {
    @Test
    fun `Function takeOverTheWorld() must return correct value`() {
        val correctValue = "Вася захватит мир через 8 лет. Му-ха-ха!"
        assertThat(PlanTakeOverTheWorld.takeOverTheWorld("Вася", 8)).isEqualTo(correctValue)
    }
}
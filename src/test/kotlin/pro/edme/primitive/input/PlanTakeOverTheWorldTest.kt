package pro.edme.primitive.input

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class PlanTakeOverTheWorldTest {
    @Test
    fun `Function takeOverTheWorld() must return correct value`() {
        val correctValue = "Вася захватит мир через 8 лет. Му-ха-ха!"
        PlanTakeOverTheWorld.takeOverTheWorld("Вася", 8).assertTrimmedEqualsIgnoreCase(correctValue)
    }
}
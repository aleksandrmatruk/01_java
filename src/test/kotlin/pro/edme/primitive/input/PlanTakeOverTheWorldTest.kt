package pro.edme.primitive.input

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlanTakeOverTheWorldTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "Вася захватит мир через 8 лет. Му-ха-ха!"
        assertEquals(PlanTakeOverTheWorld.takeOverTheWorld("Вася", 8), correctValue)
    }
}
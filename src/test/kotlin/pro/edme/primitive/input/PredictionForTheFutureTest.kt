package pro.edme.primitive.input

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PredictionForTheFutureTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue = "Коля получает 3000 через 5 лет."
        assertEquals(PredictionForTheFuture.createPrediction("Коля", 3_000, 5), correctValue)
    }
}
package pro.edme.primitive.input

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class PredictionForTheFutureTest {
    @Test
    fun `Function createPrediction() must return correct value`() {
        val correctValue = "Коля получает 3000 через 5 лет."
        PredictionForTheFuture.createPrediction("Коля", 3_000, 5).assertTrimmedEqualsIgnoreCase(correctValue)
    }
}
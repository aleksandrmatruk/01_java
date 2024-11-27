package pro.edme.primitive.input

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PredictionForTheFutureTest {
    @Test
    fun `Function createPrediction() must return correct value`() {
        val correctValue = "Коля получает 3000 через 5 лет."
        assertThat(PredictionForTheFuture.createPrediction("Коля", 3_000, 5)).isEqualTo(correctValue)
    }
}
package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class CrossingTheRoadTest {
    companion object {
        private const val GREEN = "Зелёный"
        private const val YELLOW = "Жёлтый"
        private const val RED = "Красный"
    }
    
    @Test
    fun `Function getTrafficLightColor() must return correct value`() {
        CrossingTheRoad.getTrafficLightColor(2.5).assertTrimmedEqualsIgnoreCase(GREEN)
        CrossingTheRoad.getTrafficLightColor(5.0).assertTrimmedEqualsIgnoreCase(GREEN)
        CrossingTheRoad.getTrafficLightColor(3.0).assertTrimmedEqualsIgnoreCase(YELLOW)
        CrossingTheRoad.getTrafficLightColor(4.0).assertTrimmedEqualsIgnoreCase(RED)
    }
}
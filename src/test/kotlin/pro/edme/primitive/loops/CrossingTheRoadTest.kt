package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CrossingTheRoadTest {
    @Test
    fun `Function getTrafficLightColor() must return correct value`() {
        assertThat(CrossingTheRoad.getTrafficLightColor(2.5)).isEqualToIgnoringCase("зелёный")
        assertThat(CrossingTheRoad.getTrafficLightColor(5.0)).isEqualToIgnoringCase("зелёный")
        assertThat(CrossingTheRoad.getTrafficLightColor(3.0)).isEqualToIgnoringCase("жёлтый")
        assertThat(CrossingTheRoad.getTrafficLightColor(4.0)).isEqualToIgnoringCase("красный")
    }
}
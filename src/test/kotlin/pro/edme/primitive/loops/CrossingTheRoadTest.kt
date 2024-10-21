package pro.edme.primitive.loops

import org.apache.commons.lang3.StringUtils.equalsIgnoreCase
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CrossingTheRoadTest {
    @Test
    fun `Function must return correct value`() {
        assertTrue(
            equalsIgnoreCase(
                CrossingTheRoad.getTrafficLightColor(2.5),
                "зелёный"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                CrossingTheRoad.getTrafficLightColor(5.0),
                "зелёный"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                CrossingTheRoad.getTrafficLightColor(3.0),
                "жёлтый"
            )
        )

        assertTrue(
            equalsIgnoreCase(
                CrossingTheRoad.getTrafficLightColor(4.0),
                "красный"
            )
        )
    }
}
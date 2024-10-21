package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EightTriangleTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            EightTriangle.getTriangle().trim(),
            "8\n" +
                    "88\n" +
                    "888\n" +
                    "8888\n" +
                    "88888\n" +
                    "888888\n" +
                    "8888888\n" +
                    "88888888\n" +
                    "888888888\n" +
                    "8888888888\n"
        )
    }
}
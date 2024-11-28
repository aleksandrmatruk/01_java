package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EightTriangleTest {
    @Test
    fun `Function getTriangle() must return correct value`() {
        val correctValue = "8\n88\n888\n8888\n88888\n888888\n8888888\n88888888\n888888888\n8888888888"
        assertThat(EightTriangle.getTriangle().trim()).isEqualTo(correctValue)
    }
}
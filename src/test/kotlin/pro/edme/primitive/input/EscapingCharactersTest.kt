package pro.edme.primitive.input

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EscapingCharactersTest {
    @Test
    fun `Function must return correct value`() {
        val correctValue =
            "It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\n" +
                    "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\""

        assertEquals(EscapingCharacters.createText(), correctValue)
    }
}
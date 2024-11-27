package pro.edme.primitive.input

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class EscapingCharactersTest {
    @Test
    @Disabled ("Душный тест на душную задачку. Убрать")
    fun `createText must return correct value`() {
        val correctValue = "It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"\nIt's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\""
        assertThat(EscapingCharacters.createText()).isEqualTo(correctValue)
    }
}
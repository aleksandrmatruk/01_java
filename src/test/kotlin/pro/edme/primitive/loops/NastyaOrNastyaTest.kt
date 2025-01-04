package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import pro.edme.primitive.assertTrimmedEqualsIgnoreCase

class NastyaOrNastyaTest {
    companion object {
        private const val IDENTICALLY = "Имена идентичны"
        private const val LENGTHS_ARE_EQUALS = "Длины имен равны"
        private const val EMPTY = ""
    }
    
    @Test
    fun `Function must return correct value`() {
        NastyaOrNastya.compareNames("Nastya", "Nastya").assertTrimmedEqualsIgnoreCase(IDENTICALLY)
        NastyaOrNastya.compareNames("Vova", "Nastya").assertTrimmedEqualsIgnoreCase(EMPTY)
        NastyaOrNastya.compareNames("Vova", "Dima").assertTrimmedEqualsIgnoreCase(LENGTHS_ARE_EQUALS)
    }
}
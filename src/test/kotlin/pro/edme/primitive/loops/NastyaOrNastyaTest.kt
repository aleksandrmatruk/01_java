package pro.edme.primitive.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NastyaOrNastyaTest {
    @Test
    fun `Function must return correct value`() {
        assertEquals(
            NastyaOrNastya.compareNames("Nastya", "Nastya"),
            "Имена идентичны"
        )

        assertEquals(
            NastyaOrNastya.compareNames("Vova", "Nastya"),
            ""
        )

        assertEquals(
            NastyaOrNastya.compareNames("Vova", "Dima"),
            "Длины имен равны"
        )
    }
}
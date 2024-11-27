package pro.edme.primitive.loops

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NastyaOrNastyaTest {
    @Test
    fun `Function must return correct value`() {
        assertThat(NastyaOrNastya.compareNames("Nastya", "Nastya")).isEqualToIgnoringCase("Имена идентичны")
        assertThat(NastyaOrNastya.compareNames("Vova", "Nastya")).isEqualToIgnoringCase("")
        assertThat(NastyaOrNastya.compareNames("Vova", "Dima")).isEqualToIgnoringCase("Длины имен равны")
    }
}
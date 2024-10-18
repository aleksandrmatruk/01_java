package ru.edme

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LessonOneTest {

    @Test
    fun `Function must return correct value`() {
        val correctValue = "12 и 2"
        assertEquals(LessonOne.superFunction(), correctValue)
    }
}
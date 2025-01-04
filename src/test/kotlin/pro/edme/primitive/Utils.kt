package pro.edme.primitive

import org.assertj.core.api.AbstractStringAssert
import org.assertj.core.api.Assertions.assertThat

fun String.assertTrimmedEqualsIgnoreCase(expected: String): AbstractStringAssert<*> {
    return assertThat(this.trim()).isEqualToIgnoringCase(expected)
}
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SampleTest {
    @Test
    fun test1() {
        val expected = Parent(1L)
        val actual = Parent(2L)
        assertThat(expected)
            .usingRecursiveComparison()
            .ignoringFields("id")
            .isEqualTo(actual)
    }
}

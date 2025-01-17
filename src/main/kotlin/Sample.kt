import kotlin.random.Random

class Parent(
    val id: Long,
) {
    val lazyValue: Child by lazy {
        val value = Random.nextInt()
        println("eval random to $value")
        Child(id, "one")

    }
}

data class Child(
    val key: Long,
    val value: String,
)

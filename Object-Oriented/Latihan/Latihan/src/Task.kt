// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        when (sleep) {
            true -> println("$name, sleep!")
            false -> println("$name, let's play!")
        }

    }
}

fun main() {
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}
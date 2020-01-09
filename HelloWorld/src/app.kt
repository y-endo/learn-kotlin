import java.util.Arrays

fun main() {
    var str: String = "hoge";
    var num: Int = 10
    var float = 10F;
    var double = 1.5;

    println("Hello World! $str ${num} ${double}")
    println(str::class)
    println(num::class)
    println(float::class)
    println(double::class)

    println("改行する\n改行した")

    var message = """改行する。
                    |改行した。
    """.trimMargin()

    println(message)

    var array = arrayOf(1, 2, 3)
    var intArray = intArrayOf(1, 2, 3)
    var strArray: Array<String?> = arrayOfNulls(3)
    println("${Arrays.toString(array)}, ${Arrays.toString(intArray)}, ${Arrays.toString(strArray)}")

    var list = listOf("a", "b", "c")
    var set = setOf("A", "B", "C", "A", "D", "B")
    var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)

    println(list)
    println(set)
    println(map)
    println(map["First"])
}
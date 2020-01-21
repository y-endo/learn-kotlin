import java.util.Arrays
import sample.*

open class Sample2 constructor(name: String, age: Int) {
    var name: String
    var myAge: Int

    init {
        this.name = name
        myAge = age
    }

    open fun intro() {
        println("${this.name}、${myAge}")
    }
}

class Sample3(name: String, age: Int): Sample2(name, age) {
    override fun intro() {
        println("sample3")
        super.intro()
    }
}

fun calc(a: Int, b: Int): Int {
    return a + b
}

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

    val const = "定数";
    println(const);

    num = 4;
    var msg = if (num >= 5) {
        "numは5以上"
    } else {
        "numは5未満"
    }

    println(msg)

    fun sayHello(): Unit {
        println("Hello")
    }

    fun sayHello2(): Unit = println("Hello2")

    sayHello()
    sayHello2()
    println(calc(1, 3))

    fun sayHello3(firstName: String = "Hoge", lastName: String = "Fuga"): Unit {
        println("Hello, ${firstName} ${lastName}")
    }

    sayHello3(lastName = "Endo")
    sayHello3(firstName =  "Yuki")

    fun allSum(vararg values: Int): Int {
        var result = 0
        for (value in values) {
            result += value
        }

        return result
    }

    println(allSum(1, 2, 3, 4, 5))

    fun getSumAverage(vararg values: Int): Pair<Int, Double> {
        var result = 0
        var count = 0.0

        for (value in values) {
            result += value
            count++
        }

        return Pair(result, result / count)
    }

    println(getSumAverage(1, 2, 3, 4, 5, 6, 7, 8, 9))
    val (sum, average) = getSumAverage(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(sum)
    println(average)

    // _ と宣言することで、使いませんという意味になる。変数 _ が宣言されるわけではない
    val (sum2, _) = getSumAverage(1,2,3)

    fun prnt(n: Int): Unit {
        println(n)
    }
    intArrayOf(1,2,3,4).forEach(::prnt)

    arrayOf(1,2,3).forEach { n: Int -> print(n) }
    arrayOf(1,2,3).forEach { print(it) }
    println("")

    val sample = Sample()
    sample.age = -1
    sample.intro()

    val sample2 = Sample2("遠藤", 26)
    sample2.intro()

    val sample3 = Sample3("勇気", 26)
    sample3.intro()
}
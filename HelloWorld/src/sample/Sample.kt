package sample

class Sample: Hoge1, Hoge2 {
    var name = "名無し"
    var age = 20
        set(value) {
            if (value < 0) {
                println("年齢が不正です。")
            } else {
                field = value
            }
        }

    fun intro() {
        println("私の名前は${name}です。年齢は${age}です。")
    }

    override fun hoge() {
        super<Hoge1>.hoge()
        super<Hoge2>.hoge()
    }

    override fun hoge1() {
        println("hoge1")
    }

    override fun hoge2() {
        println("hoge2")
    }
}
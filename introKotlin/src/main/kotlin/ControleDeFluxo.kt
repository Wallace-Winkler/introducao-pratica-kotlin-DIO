class ControleDeFluxo {
    fun principal() {
        cases(1)
        cases(0L)
        cases("Hello")
        cases("hello")
        cases(MyClass("Wallace", 20, "07/06/2002"))

        println("====================================================")

        val cakes = listOf<String>("Carrot", "Chocolate", "Orange", "Pineapple")

        for (cake in cakes) {
            println("It's a $cake cake")
        }

    }

    fun cases(obj: Any) {
        when (obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a String")
            else -> println("Unknown")
        }
    }
}

class MyClass (nome: String, idade: Int, dataDeNascimento: Any)
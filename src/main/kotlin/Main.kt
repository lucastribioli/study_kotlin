fun main(args: Array<String>) {
    testesArraysInt()
    testesArraysDouble()
}

fun testesArraysInt(){
    val idades = intArrayOf(10, 33, 44, 32, 98, 90)
    var maiorIdade = Int.MIN_VALUE
    idades.forEach {idade ->
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }

    println(maiorIdade)
}

fun testesArraysDouble(){
    val salarios = doubleArrayOf(1000.5, 3344.5, 4554.3, 3432.4, 9448.5, 9033.4)
    var aumento = 1.1

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}
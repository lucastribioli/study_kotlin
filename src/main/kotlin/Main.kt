fun main(args: Array<String>) {
    val idades = intArrayOf(10, 33, 44, 32, 98, 90)
    var maiorIdade = Int.MIN_VALUE
    idades.forEach {idade ->
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }

    println(maiorIdade)
}
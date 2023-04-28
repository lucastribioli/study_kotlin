import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
//    testesArraysInt()
//    testesArraysDouble()
   val salarios = bigDecimalArrayOf("100.03", "444343.888", "60000")
//    println(salarios.contentToString())

//    addAumentoSalario(salarios)
    println(salarios.somatoria())
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
    val aumento = 1.1

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){i ->
            valores[i].toBigDecimal()
    }
}

fun addAumentoSalario(salarios: Array<BigDecimal>){
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }else{
                salario + "500".toBigDecimal()
            }
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())
}

fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce {acumulador, valor ->
        acumulador + valor
    }
}


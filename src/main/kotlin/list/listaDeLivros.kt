package list

fun main() {
    val livro1 = Livro(
        titulo = "Teste",
        autor = "Eu",
        anoPublicacao = 1990,
        editora = "Qualquer uma"
    )

    val livro2 = Livro(
        titulo = "dfdsfasddsaf",
        autor = "dsafadsfsadfds",
        anoPublicacao = 3344,
        editora = "dfdfafdsa uma"
    )

    val livro3 = Livro(
        titulo = "Testefdsdsfdsfsfdfdsf",
        autor = "Eudfdafsdf",
        anoPublicacao = 2000,
        editora = "Qualquer fggfsduma"
    )

    val livro4 = Livro(
        titulo = "Tesgfsgfdfe",
        autor = "Egfsg",
        anoPublicacao = 1944,
        editora = "Qualquer uma"
    )

    val livro5 = Livro(
        titulo = "Teste4343",
        autor = "Eaerfwefweau",
        anoPublicacao = 1945,
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4, livro5)

    val livrosOrdenados: List<Livro> = livros.sorted()
    livrosOrdenados.mostrarMaisBonitinho()

    livros.sortedBy { it.editora }.mostrarMaisBonitinho()

    livros.filter { "Qualquer" in it.editora.toString() }.mostrarMaisBonitinho()
}

fun List<Livro>.mostrarMaisBonitinho(){
   val joinToString =  this.joinToString("\n"){
        "- ${it.titulo} de ${it.autor}"
    }
    println("#### lista de Livros \n $joinToString")
}
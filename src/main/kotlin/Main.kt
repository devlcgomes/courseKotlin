
// Kotlin POO - Separando Classes e Métodos de busca (GET)

/*
    No caso abaixo, iremos precisar de 2 botões, um para sucesso e um para erro. Para isso uso uma class Botão
    e a partir dessa classe como molde, eu instancio os objetos criando um por um. Ressaltando que as classes
    moldes estão criadas em arquivos separados
* */

fun main() {

    val userA = User()
    userA.name = "Luciano Gomes"

    // Criando a variavel para receber o retorno da função que conta o lenght do usuario.
    val userALenght = userA.getNameLenght()

    println(userA.name)
    println(userALenght)

    val btnSuccess = Button()
    btnSuccess.text = "Usuario logado com sucesso!"
    btnSuccess.color = "00FF00"

    val btnError = Button()
    btnSuccess.text = "Houve um erro ao realizar o login."
    btnSuccess.color = "FF0000"

}




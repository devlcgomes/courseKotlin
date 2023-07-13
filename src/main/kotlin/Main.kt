
// Kotlin POO

/*

* */

fun main() {

    val userA = User("Luciano Gomes")

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




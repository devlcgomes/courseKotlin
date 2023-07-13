class User {
    var name : String = "";   // Propriedade

    // Comportamento para printar o nome em letra MAIÚSCULA
    fun printUpperCase() {
         println("Olá " + name.uppercase())
    }

    // Comportamento para atualizar o nome do usuario criado
    fun updateName(newName : String) {
        name = newName
    }

    // Comportamento para contar a quantidade de caracteres do usuario e setando um retorno específico
    // Lembrando que para receber esse return e mostrar, preciso criar uma variavel para receber o valor.
    fun getNameLenght() : Int {
        return name.length
    }
}
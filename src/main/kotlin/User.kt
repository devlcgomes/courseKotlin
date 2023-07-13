
class User constructor(var name : String) {

    fun printUpperCase() {
         println("Olá " + name.uppercase())
    }

    fun updateName(newName : String) {
        name = newName
    }

    fun getNameLenght() : Int {
        return name.length
    }
}
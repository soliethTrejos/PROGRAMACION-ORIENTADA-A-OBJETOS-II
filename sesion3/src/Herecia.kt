//open abre el inicio de la herencia
open class Persona(
    var nombre: String ="",
    var apellido: String ="",
){
    fun saludar (): String {
        return "Hola mi nombre es $nombre $apellido," +
                " mucho gusto"
    }
}

class Empleado(nombre : String,apellido :
String,var role: String) : Persona(nombre,apellido){

}

fun main (){
    val empleado = Empleado(nombre = "jose", apellido = "Garcia", role = "Docente")
    println(empleado.saludar())
}
class Estudiante {

    //var para poder cambiar el valores despues
    var nombre = ""
    var carnet = ""
    var carrera = ""
    var año = 0

    //funcion que muestra los datos de una manera ordena y recordandpo que "$"paqra el interlineado
    fun mostrarDatos() {
        println("Información del Estudiante: ")
        println(" Nombre: $nombre\n Carnet: $carnet\n Carrera: $carrera\n Año: $año")
    }
}


fun main(){
    val estudiante = Estudiante()

    //asignacion de valores a cada varialble y el print
    estudiante.nombre = "Carlos Alberto"
    estudiante.carnet = "2325691"
    estudiante.carrera = "Arquitectura"
    estudiante.año = 1
    estudiante.mostrarDatos()

    estudiante.nombre = "Maria Esperanza"
    estudiante.carnet = "25456859"
    estudiante.carrera = "Derecho"
    estudiante.año = 2
    estudiante.mostrarDatos()

    estudiante.nombre = "Luis Enrique"
    estudiante.carnet = "24010975"
    estudiante.carrera = "Derecho/Psicologia"
    estudiante.año = 3/2
    estudiante.mostrarDatos()

}

class Estudiante {
    var nombre = ""
    var edad = 0

    fun estudiar(){
        println("El estudiante $nombre esta estudiando...")
    }
}

class Asignatura(private val nombre: String, private val precio: Double) {

    fun getNombre(): String {
        return "La asignatura se llama: $nombre "
    }
    fun getPrecio(): Double {
        return precio

    }
}




fun main(){
    val estudiante = Estudiante()

    estudiante.nombre="Lee Pace"
    estudiante.edad=20
    estudiante.estudiar()

    estudiante.nombre="Oscar Isaac"
    estudiante.edad=30
    estudiante.estudiar()

    val poo = Asignatura(nombre = "POO",250.0)

    println(poo.getNombre())
    println(poo.getPrecio())
}
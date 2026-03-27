// padre
open class Empleado (
    private var nombre : String,
    private var salario : Double,
)
{
    open fun mostarInformacion(): String {
        return "Datos del empleado \nNombre: $nombre \nsalario: $salario"
    }
}
//Heredero
class programador(
    nombre : String,
    salario : Double,
    var lenguage : String
) : Empleado(nombre, salario)
{
    override fun mostarInformacion(): String {
        //super es el elemento heredado
        return "${super.mostarInformacion()}\nCargo: Programador \nLenguaje: $lenguage"
    }
}
fun main(){
    var programador = programador(
        "Miguel",2000.0,"Java"
    )
   println(programador.mostarInformacion())
}
class Taxi(
    var placa: String,
    var conductor: String,
    var modelo: String
) {

    fun iniciarServicio() {
        println("El taxi con placa $placa, conducido por $conductor, modelo $modelo, ha iniciado servicio.")
    }
}

fun main() {
    val taxi1 = Taxi("GR-101", "Carlos López", "Toyota Corolla")
    val taxi2 = Taxi("GR-202", "María Pérez", "Hyundai Accent")
    val taxi3 = Taxi("GR-303", "José Ramírez", "Kia Rio")

    taxi1.iniciarServicio()
    taxi2.iniciarServicio()
    taxi3.iniciarServicio()
}
}
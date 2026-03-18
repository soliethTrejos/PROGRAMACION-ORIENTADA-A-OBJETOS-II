//clase donde se ubica las la variables
// y se ponen si son mutables o inmutable s
class BUs (
    var numeroRuta: Int,
    var capacidad: Int,
    var conductor : String
)
{
    fun iniciarRuta(): String{
        return "El bus $numeroRuta de capacidad " +
                "$capacidad comenzo su viaje con el conductor $conductor "
    }

}
  fun main(){
      val ruta1 = BUs(168, 30,"Jose")
      val ruta2 = BUs(111, 30,"Mario")
      println(ruta1.iniciarRuta())
      println(ruta2.iniciarRuta())
  }
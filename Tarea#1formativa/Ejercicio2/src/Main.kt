data class Producto (
    var  nombre : String,
    var precio : Double,
    var cantidad : Int
)
{
    fun mostrarproductos(){
        println("producto $nombre")
        println("precio $precio")
        println("cantidad $cantidad")
    }
}
fun main(){
    val producto1 = Producto( "crema",  150.0 ,4);
    val producto2 = Producto("galletas ",100.0 ,20);
    val producto3 = Producto( "papel ",350.0 ,6);
    val producto4 = Producto("Jabon",60.5,2);
    val producto5 = Producto("chicles ",30.0,4);

    producto1.mostrarproductos()
    producto2.mostrarproductos()
    producto3.mostrarproductos()
    producto4.mostrarproductos()
    producto5.mostrarproductos()


}
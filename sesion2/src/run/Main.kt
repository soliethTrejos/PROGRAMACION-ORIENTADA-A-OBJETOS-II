package run

import org.w3c.dom.css.Counter

fun main () {
    //mutable
    var age = 0

    println(age)

    age = 13
    println(age)

    //creacion de varialbles mutables
    var days =  "Lunes"

    println(days)

    days = "Martes"
    println(days)

    //variables inmutables
    val college = "UAM"
    println(college)

    //variables de tipo entero
    val quan : Int = 20
    var totalStudents : Int = 20
    println("cantidade : ${quan} \n Total de estudiantes : $totalStudents")

    //variable tipo decimal
    val price : Double = 3.0
    var average : Float = 100.0f
    println("Promedio : $average Precio $price")

    //texto
    val phrase : String = "deja de medir las tareas y empieza a medir el impacto "
    println(phrase)

    //caracter
    val grade : Char  = 'A'
    println("tu calificacion es $grade")

    //Boleano
    var isActive : Boolean = true
    isActive = true
    println(isActive)

}



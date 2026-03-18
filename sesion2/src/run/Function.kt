package run

fun sayhola(){
    println("Hola mundo desde la uam")
}

fun greet(name:String){
    println("Hello $name")

}

fun addGrade(grade:Int , extra: Int): Int{
    return grade + extra
}

fun getScores (score : Int , extra : Int) : Int = score + extra

fun createUser (name : String, rol : String = "ususario")
{
    println("Usuario $name y su rol $rol")
}

fun main(args: Array<String>) {
    sayhola()
    greet("soli")
    println("Nota final  ${addGrade(grade = 70 , extra = 10)}")
    println("Aumento ${getScores(score = 70 , extra = 10)}")
    println("${createUser(name = "alejandro ")}")
    println("${createUser(name = "alejandro" , rol = "Administrador")}")

}
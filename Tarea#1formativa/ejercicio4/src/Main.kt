class CuentaBancaria(
    private var numeroCuenta: String,
    private var saldo: Double
) {

    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println("Depósito realizado: $monto")
        } else {
            println("El monto a depositar debe ser mayor que 0")
        }
    }

    fun retirar(monto: Double) {
        if (monto <= 0) {
            println("El monto a retirar debe ser mayor que 0")
        } else if (monto > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= monto
            println("Retiro realizado: $monto")
        }
    }

    fun consultarSaldo() {
        println("Número de cuenta: $numeroCuenta")
        println("Saldo actual: $saldo")
    }
}

fun main() {
    val cuenta1 = CuentaBancaria("001-2026", 500.0)

    cuenta1.consultarSaldo()
    println()

    cuenta1.depositar(200.0)
    cuenta1.consultarSaldo()
    println()

    cuenta1.retirar(100.0)
    cuenta1.consultarSaldo()
    println()

    cuenta1.retirar(700.0)
}
// Factorial
def factorial(n:Long, resultado: Long = 1L): Long =
  if (n == 0) {
    println("Termino")
    resultado
  } else{
    println(s"Va calculando ${n}, resultado: ${resultado}")
    factorial(n - 1, n * resultado)
  }
  println(factorial(3))


/// Funcional
val result = (1 to 4).foldLeft(1L)((r, n) => r * n)


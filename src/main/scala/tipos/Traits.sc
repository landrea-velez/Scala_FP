/**
 * Aunque los Traits son similares a las clases,
 * se suele preferir en Scala para agrupar código.
 * En vez que tener funciones sueltas, normalmente las agruparemos dentro de Traits.
 *
 * También se puede definir un trait usando la palabra
 * sealed trait .
 * Hacerlo así que evita que puedan instanciarse objetos
 * usando ese trait por fuera del archivo de su definición.*/

// Definición de un trait
trait ejemplo {
  val valor = 5
  def funcion(x: Int) = x * x
}

// Para instanciarse debe usarse un objeto
object ejemplo extends ejemplo
/**
 * Los tipos de datos genéricos se comportan como
 * un comodín. Permiten tener certeza de un dato
 * pero sin saber cuál es aún
 *
 * Pero ya en tiempo de compilación se vuelven
 * específicos*/

def f[A](x: A): String = s"$x"

f("laura")
f(23)
f(true)


trait ejemplo[A, B]{
  def g(x: A, f: A => B) :B = f(x)
}

object Ejemplo extends ejemplo[Int, String]

Ejemplo.g(20, f)
def f[A](x: A): String = s"$x"

f("laura")
f(23)
f(true)


trait ejemplo[A, B]{
  def g(x: A, f: A => B) :B = f(x)
}

object Ejemplo extends ejemplo[Int, String]

Ejemplo.g(20, f)
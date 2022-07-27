class funciones1 {

  // Funciones
  def f(x: Int) = x * x
  f(1)
  f(2)
  f(3)

  // Funciones anónimas
  (x:Int) => x * x

  // Asignar a un valor la función anónima
  val a  = (x:Int) => x * x
  a(2)
  a(3)
  a(4)

  // las funciones también son tratadas como objetos
  // f.apply(2) falla porque a es un objeto y f es una función suelta
  a.apply(2)
  // Así el compilador es capaz de transformar f en un objeto
  val c = f _
  c(2)
  c(3)
  c(4)

  c.apply(2)

  // Funciones de orden superior
  def g(h:Int => Int) = h(3)
  g(f)

  // currying encadenando valores
  def k(h: Int => Int)(x: Int) = h(x)
  k(f)(3)
  k(f)(4)

  // Funciones métodos
  object Util{
    def metodo(x: Int) = x + x
    val a = metodo _
  }

  Util.metodo(3)
  Util.a(3)













}

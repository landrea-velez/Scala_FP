// el tipo de dato es un Option[Int] y está especializado como Some(2)
val a = Option(2)

// el tipo de dato es un Option[Null] y está especializado como None
val b = Option(null)

// aunque el compilador lo permite no se recomienda asumir este tipo
val c = Some(null)

val lista = List(1,2,3)
lista.find(x => x==3) //  Option[Int] = Some(3)
lista.find(x => x==4) //  Option[Int] = None

lista.find(x => x==3).map(_ +1) // Option[Int] = Some(4)

lista.find(x => x==4).map(_ +1) // Sigue siendo None


lista.find(x => x==3).map(x => lista.headOption.map(y => x+y)) // Option[Option[Int]]

// su funcion es aplanar
lista.find(x => x==3).flatMap(x => lista.headOption.map(y => x+y)) // Option[Int] = Some(4)


val res1 = lista.find(x => x==3).flatMap(x => lista.headOption.map(y => x+y)) // Option[Int] = Some(4)

// get al igual que head es una funcion parcial y puede fallar
// no se puede hacer un .get a un None
res1.getOrElse(0)
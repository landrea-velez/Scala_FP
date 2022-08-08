// El tipo de dato que devuelve corresponde
// al tipo de datos de la tupla
val tupla = (1, "w", false)
tupla


// Seleccionar un valor de una tupla
tupla._1
tupla._2
tupla._3


// Para definir objetos lo hacemos por medio de los case class
case class Persona(id:Int, nombre:String, activo: Boolean)
val p = Persona(123, "Laura", true)
p

// Seleccionar un valor de un objeto
p.id
p.nombre
p.activo


// Se puede pasar de una tupla a un objeto y visceversa
// Se reuqiere de algunas funcionas
Persona.tupled(tupla)
Persona.unapply(p)

// La función copy

// Dos case class
case class A(id: Int)
case class B(id: Int, a: A)

// obj1 es inmutable
val obj1 = B(1, A(0))
// obj2 es la copia con una copia interna modificada.
val obj2 = obj1.copy(a = obj1.a.copy(1))
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
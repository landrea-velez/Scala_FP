/**
 * Definición de tipos en Scala
 * Class
 * Case Class
 * Trait
 * Type alias
 * Generics
 */

type PersonaId = Int
// defined type alias PersonaId

case class Persona(id: PersonaId, nombre:String)
// defined class Persona

type Estudiante = Persona
// defined type alias Estudiante

new Estudiante(1, "Daniel")
// res: Persona = Persona(1,Daniel)

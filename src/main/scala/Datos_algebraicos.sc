sealed trait Persona

case class Estudiante(nombre: String) extends Persona

case class Profesor(nombre: String, profesion: String) extends Persona

val me:Persona = Profesor("Laura", "Desaarrolladora")




/**
 * Cuando se realiza un Match Pattern
 * el compilador nos ayuda a saber cuando
 * estamos dejando por fuera
 * alguna de nuestras posibilidades de el tipo de datos

 * match may not be exhaustive.
 * It would fail on the following input: Estudiante(_)
}*/

me match {
  case Profesor(nombre, profesion) => s"$nombre es $profesion"
}

me match {
  case Estudiante(nombre) => s"Estudiante $nombre "
  case Profesor(nombre, profesion) => s"$nombre es $profesion"
}


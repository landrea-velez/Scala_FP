/**Cuando son de tipo producto, se pueden implementar como simples “case, class o Traits”.
Cuando son de tipo suma, se puden immplementar con saled traits.
 **/

sealed trait Persona

case class Estudiante(nombre:String) extends Persona
case class Profesor(nombre:String, profesion:String) extends Persona


val me: Persona = Profesor("Laura", "Desarrollador")

me match {
  case Estudiante(nombre) => s"$nombre, es estudiante"
  case Profesor(nombre, profesion) => s"$nombre, es $profesion"
}
// Emparejamiento de Strings
"Hola" match{
  case "Mundo" => "No"
  case "Hola" => "Si"
}



def g(x:Seq[Int]) = x match {
  case List(a, b, c) => a + b + c
  case List(a, b, c, d) => a + b + c + d
  case _ => 0
}

g(Seq(1,1,1,1))
g(Seq(1,1,1))
g(Seq(1,1))




case class Persona(nombre: String, edad: Int)

val p1 = Persona("Maria", 20)
val p2 = Persona("Freddy", 15)

def h(p: Persona) = p match {
  case y if y.edad >= 18 => "es mayor de edad"
  case _ => "No es mayor de edad"
}

h(p1)
h(p2)
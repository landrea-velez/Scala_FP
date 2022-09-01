// Try está enfocada en los casos en los que tenemos excepciones
import scala.util.{Failure, Success, Try}


//No explota sino que genera un tipo de dato Failure
val a = Try(Nil.head)

// No sucede nada porque sigue siendo un Failure
a.map(x => s"$x")



def estallar(): Int ={
  println("Diviendo por cero :/")
  2/0
}

def computar(): Int ={
  println("Retornando un 1 :)")
  1
}

def f = Try{estallar}
def s = Try{computar}


f match {
  case Success(valor) => s"$valor"
  case Failure(e) => s"ocurrio un error $e"

}


s match {
  case Success(valor) => s"$valor"
  case Failure(e) => s"ocurrio un error $e"
}



val res = for{
  x <- s
  y <- s
  z <- s
} yield x + y + z

val res2 = for{
  x <- s
  y <- f.recoverWith{case e: Exception => Try(6)}
  z <- s
} yield x + y + z


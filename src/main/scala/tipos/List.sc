/**
 * Hasta Scala 2.12 la taxonomía de colecciones es la siguiente:
 *
 * Para inmutables:
 * https://docs.scala-lang.org/resources/images/collections.immutable.png
 *
 * Para mutables:
 * https://docs.scala-lang.org/resources/images/collections.mutable.png
 *
 * La documentación de Scala para colecciones la puede encontrar en:
 * https://docs.scala-lang.org/overviews/collections/introduction.html
 *
 * El api doc de colecciones lo encuentra en:
 *
 * https://www.scala-lang.org/api/current/scala/collection/index.html
 */


val lista: List[Int] = List(1, 2, 3, 4)
val lista2 = 1 :: 2 :: 3 :: 4 :: Nil


var sum = 0
lista.foreach(x =>  sum += x)
sum



var l1 = List(1,2,3)
l1 = 4::l1



val l1 = List(1,2)
val l2 = List(3,4)
val l3 = l1:::l2



val lista = List( 2, 3, 4)
val l1 = 1 +: lista :+ 5


val dropped =l1.drop(2)

l1.head


l1.tail

l1.reverse

l1.mkString("&")


val listaVacia = List()
 // listaVacia.head
val result = listaVacia.headOption
// listaVacia.tail



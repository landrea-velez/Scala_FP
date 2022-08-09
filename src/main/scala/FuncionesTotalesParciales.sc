/**
 * Hay que tener cuidado con funciones que no están
 * bien definidas o que son inseguras de usar por
 *  NO ser funciones totales EJ.
 * .gewt()
 * .head()
 * .tail()
 * .last() */

val a = List(1,2,3,4,5)
val b = Nil

a.head // trar el primer valor en lista
a.tail // trae los demás valores

// b.head
// b.tail

//Sin embargo hay funcones equivalentes
a.take(1)
a.drop(1)
b.take(1)
b.drop(1)

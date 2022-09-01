
Right(10).map(_ +1) // Opera el lado derecho, Either[Nothing,Int] = Right(11)

//Left(10).map(_ + 1) // error

Left[Int, Int](10).map(_ +1) // no lo opera el map
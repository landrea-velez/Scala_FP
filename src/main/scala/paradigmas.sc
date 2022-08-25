val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
numbers.filter(n => n%2 == 0).map(n => if (n<5)5 else n)


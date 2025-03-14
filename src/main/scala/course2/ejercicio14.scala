package course2

/*
 De una lista de números imprime  la cantidad de scala del número
 Por ejemplo 1 - Scala, 2 - ScalaScala
 */
def imprimir(valor:List[Int]): List[String] = {
  valor.flatMap(s => List(List.fill(s)("Scala").mkString))
}

/*
 Generar los 100 primero números a través de una lista de manera recurviva
*/
def numerosRecursivos(valor:Int = 1): List[Int] = {
  if valor == 100 then valor::Nil else valor::numerosRecursivos(valor+1)
}

/*
 De los 100 primeros números cuales son primos o no
*/
def numerosPrimos(): List[Int] = {
  numerosRecursivos().filter(isPrimo(_))
}

/*
 De una lista de números dar los dígitos de esa lista
*/
def numerosDigitos(valor:List[Int]) = {
  valor.flatMap(s => s.toString.map(s => s.asDigit).toList)
}

@main def ejercio14(): Unit = {
  println(numerosDigitos(numerosPrimos()))
}
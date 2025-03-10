package course1

// Poner todas las letras de un String en mayuscula, una por una
def mayusculuca(palabra:Option[String]): String =
  palabra.getOrElse("No hay una palabra para trabajar con ella").map(letra => letra.toUpper).toString

@main def iniciar: Unit =
  try
    println(mayusculuca(None))
  catch
    case e: Exception => println("Error en la operación, repetir")

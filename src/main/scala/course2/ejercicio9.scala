package course2

// Concatenar una cadena N veces
def concatenar(valor:String, repeticion: Int = 1): String = {
  if repeticion == 1 then valor
  else valor + concatenar(valor,repeticion-1)
}

@main def ejercicio9():Unit = {
  println(concatenar("Scala",2))
}
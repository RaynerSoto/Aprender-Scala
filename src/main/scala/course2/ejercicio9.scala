package course2

// Concatenar una cadena N veces
def concatenar(valor:String, repeticion: Int = 1): String = {
  if repeticion == 1 then valor
  else valor + concatenar(valor,repeticion-1)
}

//Fibonnaci con validación para valores negativos
def fibonacci(valor1:Long = 0, valor2:Long = 1, posicion:Long, iterador: Long = 3): Long = {
  posicion match
    case 1 => valor1
    case 2 => valor2
    case posicion if posicion < 0 => -1
    case _ =>  if iterador == posicion then valor1+valor2 else fibonacci(valor2,valor1 + valor2,posicion,iterador + 1)
}

@main def ejercicio9():Unit = {
  println(fibonacci(posicion = 15))
}
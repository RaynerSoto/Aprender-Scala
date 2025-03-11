package course2
import scala._
/*
Imprimir una variable con el tipo
*/

def imprimirVariables[T](valor:T): Unit = valor match
  case valor: String  => println(s"Esto es un String con valor ${valor}")
  case valor: Byte    => println(s"Esto es un Byte con valor ${valor}")
  case valor: Short   => println(s"Esto es un Short con valor ${valor}")
  case valor: Int     => println(s"Esto es un Int con valor ${valor}")
  case valor: Long    => println(s"Esto es un Long con valor ${valor}")
  case valor: Float   => println(s"Esto es un Float con valor ${valor}")
  case valor: Double  => println(s"Esto es un Double con valor ${valor}")
  case valor: Boolean => println(s"Esto es un Boolean con valor ${valor}")
  case valor: Char    => println(s"Esto es un Char con valor ${valor}")
  case _ => println("Tipo de dato no reconocido o desarrollado por el usuario")




@main def ejercicio12 : Unit = {
  println(imprimirVariables(12))
}
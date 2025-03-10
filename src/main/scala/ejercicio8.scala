import scala.annotation.tailrec
// Ejercicio sobre recursividad

// Suma de los elementos hasta un número de manera recursiva
def sum(valor :Long) : Long = {
  if valor == 1 then 1
  else valor + sum(valor-1)
}

// Imprimir una cadena N veces
def imprimirNveces(valor: String, repeticiones: Int): Unit =  {
  if repeticiones != 0 then
    println(valor)
    imprimirNveces(valor,repeticiones-1)
}

//Probar si un número es primo
def isPrimo(valor: Long) : Boolean = {
  if valor <= 2 && valor > 0 then true
  else if valor <= 0 then false
  else
    @tailrec
    def isPrim(valor: Long, valor2: Long): Boolean =
      if (valor2 <= 1) then true
      else if (valor % valor2 == 0) then false
      else isPrim(valor,valor2 - 1)
    isPrim(valor,valor-1)
}

@main def probarEjercicio7(): Unit = {
  println(isPrimo(13))
}
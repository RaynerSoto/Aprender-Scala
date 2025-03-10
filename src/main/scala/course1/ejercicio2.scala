package course1



// Función que multiplique 2 números enteros
def multiplicar(valorA: Int = 0, valorB: Int = 0): Int = valorA * valorB

// Definir el mayor de 3 números
def mayor3numeros(valorA: Double,valorB: Double, valorC: Double): Double = if valorA >= valorB then (if valorA >= valorC then valorA else valorC) else (if valorB >= valorC then valorB else valorC)

// Saludo personalizado
def saludo(nombre: String = "extraño"):Unit = println(s"Hola $nombre")

// Factorial con recursividad
def factorial(number: Int): Long = if number != 1 then number.toLong * factorial(number-1) else number

// Maximo valor de una lista, sin usar max
def maximo(array: Array[Int]) :Int =
  var max = 0
  array.foreach(x => if x > max then max = x)
  max


@main
def pruebaEjercicio2: Unit =
  println(maximo(Array(12,34,56,2,1,3,45,6,2)))
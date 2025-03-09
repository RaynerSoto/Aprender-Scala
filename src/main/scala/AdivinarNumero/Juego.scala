package AdivinarNumero
import java.util.Scanner.*
import java.util.Random.*
import java.util.{Date, Scanner}
import scala.util.Random

@main def interfaz_principal : Unit =
  println("Indique que número desea que el ordenador le adivine en el rango de: -999999999999999999 y 999999999999999999L")
  val s = new Scanner(System.in).nextLong()
  val inicio = new Date().getTime
  println(adivinar(valor = s) + s" con un tiempo de ${new Date().getTime - inicio} milisegundos")

def adivinar(minimo: Long = -999999999999999999L, maximo:Long = 999999999999999999L, valor: Long, iteraciones: Long = 0): String =
  val numero = Random.between(minimo,maximo)
  if (numero == valor) then s"El número a sido encontrado con ${iteraciones} iteraciones"
  else if numero < valor then adivinar(numero,maximo, valor,iteraciones + 1)
  else adivinar(minimo,numero,valor, iteraciones + 1)
  end if
end adivinar


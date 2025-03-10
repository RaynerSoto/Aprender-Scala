

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@main
def main(): Unit =
  val rango: Range = 1 to 20000000 by 1230
  rango.filter(_ % 7 == 0).map(println)

  val word: String = "Persona"
  if(word.equalsIgnoreCase(word.reverse))
    println("La palabra es un palíndromo")
  else
    println("La palabra no es un palíndromo")
  end if


  println(promedio(Array(3,3,4,5,5,5,3,2,5)))
end main

def promedio(array: Array[Int]): Double = array.sum.toDouble / array.length
package course2

// Buscar una letra en una cadena de texto si utilizar la función count
def buscarLetras(palabra:String,letra:Char): Long = {
  var cuenta:Long = 0L
  palabra.foreach(s => if s.equals(letra) then cuenta += 1)
  cuenta
}
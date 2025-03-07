// Imprimir según la posición en una competición, que medalle obtuvo
def medallero(posicion:Int = 0): String = posicion match
  case 0 => "No has participado en esta competición"
  case 1 => "Has obtenido la medalla de oro"
  case 2 => "Has obtenido la medalla de plata"
  case 3 => "Has obtenido la medalla de bronce"
  case _ => "Buen intento al haber participado, mejor suerte para la próxima"


@main def ejercicio3 : Unit = println(medallero())
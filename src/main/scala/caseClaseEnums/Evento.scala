package caseClaseEnums

import Pais._

def posicion_final(jugadores: Array[Jugador]): Array[Jugador] =
  jugadores.sortBy(s => s.tiempo)

// Para clasificar a las Olimpiadas son los 56 primeros atletas en pasa
@main def evento: Unit = {
  val jugadores = Array(
    Jugador("Rayner Alejandro Soto Martínez", 24,Pais.CU, 16.23),
    Jugador("Dianelis de las Mercedes Estenoz Vazquez", 23,Pais.MX, 22.31),
    Jugador("Usain Bolt",40,Pais.USA,9.19)
  )
  posicion_final(jugadores).take(56).foreach(s => println(s.jugadorMessage))
}
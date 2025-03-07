package caseClaseEnums
import Pais.*

case class Jugador(nombre:String, edad:Int, pais:Pais, tiempo:Double):
  def jugadorMessage: String = s"Nombre: ${nombre}, edad: ${edad}, tiempo: ${tiempo}"

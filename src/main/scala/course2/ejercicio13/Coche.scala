package course2.ejercicio13

class Coche(modelo:String,matricula:String,propietario:String,velocidad_max:Double)  extends Vehiculo(modelo,matricula,propietario,velocidad_max){
  def abrirMaletero(valor:Boolean): String = valor match
    case true => "Maletero abierto"
    case _=> "Maletero cerrado"
}

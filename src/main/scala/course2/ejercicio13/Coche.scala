package course2.ejercicio13

class Coche(modelo:String,matricula:String,propietario:String,velocidad_max:Double,maletero:Boolean)  extends Vehiculo(modelo,matricula,propietario,velocidad_max){
  def abrirMaletero(valor:Boolean): String = valor match
    case valor if valor && maletero => "Maletero abierto"
    case valor if !maletero => "El auto no tiene maletero"
    case _=> "Maletero cerrado"
}

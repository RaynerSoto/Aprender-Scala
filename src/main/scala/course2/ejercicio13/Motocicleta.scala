package course2.ejercicio13

class Motocicleta(modelo:String,matricula:String,propietario:String,velocidad_max:Double)  extends Vehiculo(modelo,matricula,propietario,velocidad_max){
  def realizarStunt(valor:Boolean) : String = valor match
    case true => "Haciendo Stunt"
    case _=> "Posición normal"
}

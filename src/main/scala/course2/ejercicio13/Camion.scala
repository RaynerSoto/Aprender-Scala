package course2.ejercicio13

class Camion(modelo:String,matricula:String,propietario:String,velocidad_max:Double,carga_max:Double) extends Vehiculo(modelo,matricula,propietario,velocidad_max){
  def cargarCarga(valor:Double) : Boolean = {
    valor match
      case valor if valor <= carga_max => true
      case _ => false
  }
}

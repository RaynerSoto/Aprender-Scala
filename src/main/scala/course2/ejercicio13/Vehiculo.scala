package course2.ejercicio13

abstract class Vehiculo(modelo:String,matricula:String,propietario:String,velocidad_max:Double) {
  private var velocidadActual = 0
  def mostrarInformacion: String = s"Modelo del auto: $modelo, con matricula: $matricula, cuyo propetario es: $propietario y que alcanza un máximo de velocidad de: $velocidad_max"
  def acelerar(valor:Double): Either[String,String] = {
    velocidadActual + valor match
      case x if velocidadActual + valor <= velocidad_max =>
        Right(this.velocidadActual += valor)
      case _ => Left("No se puede aumentar más la velocidad")
  }
  def frenar(valor:Double): Either[String,String] = {
    velocidadActual - valor match
      case x if velocidadActual - valor >= 0 =>
        Right(this.velocidadActual -= valor)
      case _ => Left("No se puede disminuir más la velocidad al frenar")
  }
  def detener:Long = this.velocidadActual = 0
}

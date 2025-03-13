package course2.ejercicio13

abstract class Vehiculo(modelo:String,matricula:String,propietario:String,velocidad_max:Double) {
  private var velocidadActual:Double = 0
  def mostrarInformacion: String = s"Modelo del auto: $modelo, con matricula: $matricula, cuyo propetario es: $propietario y que alcanza un máximo de velocidad de: $velocidad_max"
  def acelerar(valor:Double): Either[String,String] = {
    velocidadActual + valor match
      case x if velocidadActual + valor <= velocidad_max =>
       this.velocidadActual += valor
        Right(s"Velocidada disminuida a $this.velocidadActual")
      case _ => Left("No se puede aumentar más la velocidad")
  }
  def frenar(valor:Double): Either[String,String] = {
    velocidadActual - valor match
      case x if velocidadActual - valor >= 0 =>
        velocidadActual -= valor
        Right(s"Velocidada disminuida a $valor")
      case _ => Left("No se puede disminuir más la velocidad al frenar")
  }
  def detener:Unit = this.velocidadActual = 0D
}

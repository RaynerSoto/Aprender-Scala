package course2

/* Ejercicio sobre coches y conductores. Para una agencia de alquiler de choferes
   El coche tiene marca, modelo, año de lanzamiento y un conductor*
   El conductor tiene nombre, apellidos, año de nacimiento. Método nombre completo*
   Edad del conductor en el año de lanzamiento del coche*
   Validar si un conductor es la misma persona que el propietario del coche*
   Método para actualizar el modelo del carro por el año del lanzamiento*
 */

class Coche(marca: String, modelo: String, annoLanzamiento: Int,duenno:Driver) {
  def difenciaEdadDuennoCar: String = annoLanzamiento match
    case annoLanzamientoo if annoLanzamiento < duenno.getAnnoNacimiento => s"El coche fue desarrallado ${annoLanzamiento-duenno.getAnnoNacimiento} antes del nacimiento de su dueño"
    case annoLanzamientoo if annoLanzamiento > duenno.getAnnoNacimiento => s"El chofer nació ${duenno.getAnnoNacimiento-annoLanzamiento} antes de la construcción del carro"
    case _ => "Ambos tienen la misma edad"
  end difenciaEdadDuennoCar
  def actualizarAnnoCarro(anno:Int) = new Coche(marca,modelo,anno, duenno)
  def isChoferActual(actualChofer:Driver) : Boolean = this.duenno.equals(actualChofer)
}

class Driver(nombre: String,apellidos: String,annoNacimiento:Int) {
  def nombreCompleto:String = nombre + " " + apellidos
  def getAnnoNacimiento: Int = this.annoNacimiento
  def getNombre: String = this.nombre
  def getApellidos:String = this.apellidos

  @Override override def equals(obj: Any):Boolean = {
    try{
      obj match
        case x if this.nombre == obj.asInstanceOf[Driver].getNombre && this.apellidos == obj.asInstanceOf[Driver].getApellidos && this.annoNacimiento == obj.asInstanceOf[Driver].getAnnoNacimiento => true
        case _ => false
    }catch
      case e: Exception => false
  }

}

@main def ejercicio11(): Unit = {
  val chofer1: Driver = Driver("Rayner Alejandro","Soto Martínez",2000)
  val chofer2: Driver = Driver("Dianelis de las Mercedes", "Estenoz Vazquez", 2001)
  val chofer3: Driver = Driver("Andy","Figueroa Gracía",1998)
  val chofer4: Driver = Driver("Edward Williams","Soto Pons",2021)
  val coche1 = new Coche("Toyota", "Corolla", 2021,chofer1)
  val coche2 = new Coche("Honda", "Civic", 2020,chofer2)
  val coche3 = new Coche("Ford", "Mustang", 2019,chofer3)
  val coche4 = new Coche("Chevrolet", "Camaro", 2022,chofer4)
  println(coche1.difenciaEdadDuennoCar)
  println(coche4.isChoferActual(chofer1))
}
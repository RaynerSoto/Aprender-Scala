// Ejercicio sobre un país y su población
case class Country(nombre:String, poblacion:Int):
  def nombrePais:String = s"País: ${nombre} con una población de ${poblacion} de personas"
end Country

// Ordenar un listado de paises por su población
def ordenarPaises(paises:Array[Country]): Array = paises.sorted(_.poblacion)

// Pais con mayor poblacion
def mayorPoblacionPais(paises: Array[Country]): Country = paises.maxBy(_.poblacion)

//Pais con una población mayor o igual a un número dado
def mayorPoblacionNumeroDato(paises:Array[Country], valor:Long): Array = paises.filter(s => s.poblacion > valor)

//Existe el país a buscar
def existePais(paises:Array[Country], nombre:String): Country = paises.find(p => p.nombre.equals(nombre))

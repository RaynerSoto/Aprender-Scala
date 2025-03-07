// Ejercicio sobre un país y su población
case class Country(nombre:String, poblacion:Int):
  def nombrePais:String = s"País: ${nombre} con una población de ${poblacion} de personas"
end Country

// Ordenar un listado de paises por su población
def ordenarPaises(paises:Array[Country]): Array[Country] = paises.sortBy(s => s.poblacion)

// Pais con mayor poblacion
def mayorPoblacionPais(paises: Array[Country]): Country = paises.maxBy(_.poblacion)

//Pais con una población mayor o igual a un número dado
def mayorPoblacionNumeroDato(paises:Array[Country], valor:Long): Array[Country] = paises.filter(s => s.poblacion > valor).toArray

//Existe el país a buscar
def existePais(paises:Array[Country], nombre:String): Boolean = paises.exists(p => p.nombre.equals(nombre))
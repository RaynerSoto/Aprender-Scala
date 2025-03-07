import Paises._

enum Paises:
  case MX,USA,CU,GD,AR
end Paises

object Paises:

  def isPais(pais_seleccionado: Paises): String = pais_seleccionado match
    case MX => "Este país es México"
    case USA => "Este país es Estados Unidos"
    case CU => "Este país es Cuba"
    case GD => "Este país es Granada"
    case AR => "Este país es Argentina"
    case _ => "País no seleccionado"
  end isPais

  def fromName(name: String): Paises =
    name.toUpperCase() match
      case "MX" => Paises.MX
      case "USA" => Paises.USA
      case "CU" => Paises.CU
      case "GD" => Paises.GD
      case "AR" => Paises.AR
  end fromName
end Paises


@main def run : Unit =
  try
    println(Paises.fromName("PR"))
  catch
    case e: Exception => println("País no encontrado")

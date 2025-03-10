package course1

import course1.Paises.*

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

  def fromName(name: String): Option[Paises] =
    try
      Some(name.toUpperCase() match
        case "MX" => Paises.MX
        case "USA" => Paises.USA
        case "CU" => Paises.CU
        case "GD" => Paises.GD
        case "AR" => Paises.AR)
    catch
      case  e:Exception => None

  end fromName
end Paises


@main def run : Unit = Paises.fromName("Peru") match
  case Some(value) => println(value)
  case None => println("No se encontró el país")

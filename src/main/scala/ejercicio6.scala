import Paises._

enum Paises:
  case MX,USA,CU,GD,AR,None
end Paises

object paises:
  def isPais(pais_seleccionado: Paises): String = pais_seleccionado match
    case MX => "Este país es México"
    case USA => "Este país es Estados Unidos"
    case CU => "Este país es Cuba"
    case GD => "Este país es Granada"
    case AR => "Este país es Argentina"
    case _ => "País no seleccionado"
  end isPais

  def fromName(name: String): Any = name.toUpperCase() match
    case "MX" => Paises.MX
    case "USA" => Paises.USA
    case "CU" => Paises.CU
    case "GD" => Paises.GD
    case "AR" => Paises.AR
    case _ => "País no seleccionado"
  end fromName
end paises



@main def run : Unit =
  println(paises.isPais(MX))


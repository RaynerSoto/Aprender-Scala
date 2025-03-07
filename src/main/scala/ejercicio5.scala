enum UnitedKingdom:
  case England,NothernIreland,Scotland,Wales
end UnitedKingdom

import UnitedKingdom._
def malditosEscoceses(pais:UnitedKingdom = Scotland) = if pais.equals(Scotland) then "Malditos escoceses han arruinado Escocia" else "No te llevaste el chiste"

def reescrituraEspañol(pais:UnitedKingdom) = pais match
  case UnitedKingdom.England => "Por el rey y la reina"
  case UnitedKingdom.NothernIreland => "Somos mejor que el sur"
  case UnitedKingdom.Scotland => "Malditos escoceses han arruinado Escocia"
  case UnitedKingdom.Wales => "El país de Gareth Bale"

@main def chistoSimpsons: Unit = println(malditosEscoceses(England))
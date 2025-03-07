enum UnitedKingdom:
  case England,NothernIreland,Scotland,Wales
end UnitedKingdom

import UnitedKingdom._
def malditosEscoceses(pais:UnitedKingdom = Scotland) = if pais.equals(Scotland) then "Malditos escoceses han arruinado Escocia" else "No te llevaste el chiste"

@main def chistoSimpsons: Unit = println(malditosEscoceses(England))
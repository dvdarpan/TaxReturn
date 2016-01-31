
object FederalTax {

  val rate = 3 / 100D
  val daily = 365D
  val interestCal = Formulas.compoundInterest(_: Double, daily, rate, _: Double)
  def interestCalDaily(p:Double ,t:Double) = {interestCal(p,t/daily) } 
  }



object FederalTax {
  def interestCal(due:Double, period:Int):Double ={
    val rate =3/100D
    val daily=365D
    Formulas.compoundInterest(due, daily, rate, period/daily)
      }
  
}
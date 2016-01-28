import scala.math._

object Formulas {
    /** Creates a person with a given name and birthdate
    *
    * @param p Principle
    * @param r Rate if interest 
    * @param n Compounding interval (daily=365,monthly=12,weekly=52,..)
    * @param t Period of deposit  (must be expressed in years)
    * @return Final Amount (Principle + interest)
    * 
    * http://www.purplemath.com/modules/expofcns4.htm
    * http://www.timeanddate.com/date/durationresult.html?m1=04&d1=15&y1=2013&m2=01&d2=28&y2=2016
    * https://www.irscalculators.com/interest-calculator.php
    */
  def compoundInterest(p:Double ,n:Double, r:Double , t:Double ):Double = {
    p*Math.pow((1+r/n), n*t)
   }
}
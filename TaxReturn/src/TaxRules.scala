
//import java.util._
import scala.annotation.switch
object TaxRules {

  /*
   * https://www.fiscal.treasury.gov/fsreports/rpt/treasRptRateExch/historicalRates.htm
   *  
   *  USD to INR based on Treasury Reporting Rates of Exchange
   */
  val rates = Map(
    "2014" -> 63.2000f,
    "2013" -> 61.5000f,
    "2012" -> 54.4500f,
    "2011" -> 52.2500f,
    "2010" -> 45.7000f,
    "2009" -> 46.4000f)

  val ratesState = Map(
    //   State, filing statuses,  income,  year ->  tax rate 
    ("al", "single", 500, 2007) -> 2,
    ("al", "single", 2500, 2007) -> 4,
    ("al", "single", 5000, 2007) -> 5,
    ("pa", "single", 0, 2011) -> 3.07,
    ("il", "single", 0, 2015) -> 3.75,
    ("il", "single", 0, 2011) -> 5,
    ("il", "single", 0, 1990) -> 5)
  val ALStandardDeduction = Map(
    (0 to 20499) -> 2500,
    (20500 to 20999) -> 2475,
    (21000 to 21499) -> 2450,
    (21500 to 21999) -> 2425,
    (22000 to 22499) -> 2400,
    (22500 to 22999) -> 2375,
    (23000 to 23499) -> 2350,
    (23500 to 23999) -> 2325,
    (24000 to 24499) -> 2300,
    (24500 to 24999) -> 2275,
    (25000 to 25499) -> 2250,
    (25500 to 25999) -> 2225,
    (26000 to 26499) -> 2200,
    (26500 to 26999) -> 2175,
    (27000 to 27499) -> 2150,
    (27500 to 27999) -> 2125,
    (28000 to 28499) -> 2100,
    (28500 to 28999) -> 2075,
    (29000 to 29499) -> 2050,
    (29500 to 29999) -> 2025,
    (30000 to Int.MaxValue) -> 2000)
    
    val ALPersonalExemption = Map(
        "single" -> 1500,
        "married" -> 3000
        )

}
import java.util._

object TaxRules {

  /*
   * https://www.fiscal.treasury.gov/fsreports/rpt/treasRptRateExch/historicalRates.htm
   *  
   *  USD to INR based on Treasury Reporting Rates of Exchange
   */

  def exchangeRate(year: String): Float = {
    year match {
      case "2014" => 63.2000f
      case "2013" => 61.5000f
      case "2012" => 54.4500f
      case "2011" => 52.2500f
      case "2010" => 45.7000f
      case "2009" => 46.4000f

    }
  }
  
  def TaxRate(area:String,income:Float, year:String): Float = {
    
    area match {
      case "AL" => income >100 match {case _ =>3f
      case 
      }
      
      
    }
    
  }
}
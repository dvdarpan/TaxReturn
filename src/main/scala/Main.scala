/*mvn install:install-file -Dfile=C:\Users\c022658\Documents\Dev\joda-time-2.9.2\joda-time-2.9.2.jar -DgroupId=joda-time -DartifactId=joda-time -Dversion=2.9.2 -Dpackaging=jar */
import org.joda.time._

object Main {
 def main(args: Array[String]) {
  
   val DueDate: DateTime = new DateTime(2013,4,15,0,0)
   val PaymentDate:DateTime = new DateTime(2016,2,15,0,0)
   
   val interestDays=Days.daysBetween(DueDate, PaymentDate).getDays
   println(FederalTax.interestCalDaily(3300, interestDays))
  println(interestDays)
  
  val x: form1040 = new form1040()
   
  }
}

import org.apache.pdfbox._
import scala.collection.immutable._

object FederalTax {

  val rate = 3 / 100D
  val daily = 365D
  val interestCal = Formulas.compoundInterest(_: Double, daily, rate, _: Double)
  def interestCalDaily(p: Double, t: Double) = { interestCal(p, t / daily) }
}

trait rule {
  var id: String
  var description: String

}
class property[T <: Any] extends rule {
  var value: T
  val name:String
}

class propertyList extends property[HashMap[Int,property[Any]]] {
  
 // id = ""
 // description = ""
  //val x = new property[Any]("line1")
  //value + (x -> 1)

  //  val put = (p: property[Any], i: Int) => { value(i) = p }
}

class form1040 {

  var lines: propertyList 
  for (x:Int <-(1 to 79)) lines.value= lines.value + (x -> new property[Any])
  
  
 // lines.value.foreach(line => println(line.id))

}
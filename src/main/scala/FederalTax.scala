
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
class property[T <: Any](name:String) extends rule {
  var value: T
}

class propertyList(name:String) extends property[ HashMap[Int,property[Any]]](name) {
  
  id = name
  description = name
  //val x = new property[Any]("line1")
  //value + (x -> 1)

  //  val put = (p: property[Any], i: Int) => { value(i) = p }
}

class form1040 {

  val lines: propertyList = new propertyList("prop")
  for (x:Int <-(1 to 79)) lines.value= lines.value + (x -> new property[Any]("line"+x))
  
  
 // lines.value.foreach(line => println(line.id))

}
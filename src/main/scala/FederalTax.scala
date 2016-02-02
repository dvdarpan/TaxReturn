
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
}

class propertyList(size: Int) extends property[HashMap[property[Any], Int]] {
  id = ""
  description = ""
  value = new HashMap[property[Any], Int]()
  val x= new property[String]()
  
value.put(x,23)
  
//  val put = (p: property[Any], i: Int) => { value(i) = p }
}

class form1040 {
  
  var lines: propertyList = new propertyList(79)
  for ((line, i) <- lines.value.zipWithIndex) {
    line.id = "line" + i
    lines.put(line, i)
  }
  lines.value.foreach(line => println(line.id))

}
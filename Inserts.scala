import com.mongodb.casbah.Imports._
import scala.collection.mutable.ArrayBuffer
import Common._
import Control._

case class Stock (symbol: String, price: Double)

object Inserts extends App {

  // (1) INSERTS
  val apple = Stock("AAPL", 600); saveStock(apple)
  val google = Stock("GOOG", 650); saveStock(google)
  val netflix = Stock("NFLX", 60); saveStock(netflix)

  def saveStock(stock: Stock) {
    val mongoObj = buildMongoDbObject(stock)
    using(MongoFactory.getConnection) { conn => {
       val result = MongoFactory.getCollection(conn).save(mongoObj)
       println("RESULT: " + result)
       result
     }
    } 
  }

}



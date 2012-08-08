import com.mongodb.casbah.Imports._
import Control._
import scala.collection.mutable.ArrayBuffer

object Delete extends App {

  val conn = MongoFactory.getConnection
  var stocks = conn("portfolio")("stocks").find
  var collection = conn("portfolio")("stocks")
  collection.remove(MongoDBObject.newBuilder.result)

  conn.close

}


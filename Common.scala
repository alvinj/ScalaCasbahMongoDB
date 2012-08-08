import com.mongodb.casbah.Imports._

object Common {

  /**
   * Convert our Stock object into a BSON format that MongoDb can store.
   */
  def buildMongoDbObject(stock: Stock): MongoDBObject = {
    val builder = MongoDBObject.newBuilder
    builder += "symbol" -> stock.symbol
    builder += "price" -> stock.price
    builder.result
  }

}


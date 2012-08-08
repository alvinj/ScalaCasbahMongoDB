import com.mongodb.casbah.MongoCollection
import com.mongodb.casbah.MongoConnection

object MongoFactory {
  
  private val SERVER     = "localhost"
  private val PORT       = 27017
  private val DATABASE   = "portfolio"
  private val COLLECTION = "stocks"

  def getConnection: MongoConnection = return MongoConnection(SERVER) 
  def getCollection(conn: MongoConnection): MongoCollection = return conn(DATABASE)(COLLECTION)
  def closeConnection(conn: MongoConnection) { conn.close }

}


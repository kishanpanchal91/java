import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnectionTest {

	public static void main(String[] args) {
		
		MongoClient  client = new MongoClient("localhost:27017");
		
//		MongoCredential credential = MongoCredential.createCredential("kishan", "test", "123".toCharArray());
		
		MongoDatabase database = client.getDatabase("test");
		
		MongoCollection<org.bson.Document> collection = database.getCollection("user");
		
		FindIterable<Document> iterableObj = collection.find();
		
		Iterator<Document> itr = iterableObj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		
	}
}

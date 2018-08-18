package org.prakash.rest.services;

import org.bson.Document;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class GoogleMapsServices {



	public void addDatatoDB(int zipcode, String formatted_address) {
		MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
		MongoClient client = new MongoClient(uri); 
		MongoDatabase mdb = client.getDatabase("test"); 
		MongoCollection<Document> collection = mdb.getCollection("googgleAPI");
		Document doc = new Document(); 
		doc.append("Zipcode", zipcode).append("Address", formatted_address); 
		collection.insertOne(doc);
		
		
	}

}

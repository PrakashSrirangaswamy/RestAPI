package org.prakash.rest.services;

import java.util.Date;

import org.bson.Document;
import org.prakash.rest.restAPI.Objects.GoogleAPIResults;
import org.prakash.rest.restAPI.Objects.MapsResponseObj;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class GoogleMapsServices{

	static final String URI = "mongodb://localhost:27017"; 
	static final String Collection = "test"; 

	public static void addDatatoDB(int zipcode, String formatted_address) {
		MongoClientURI uri = new MongoClientURI(URI);
		MongoClient client = new MongoClient(uri); 
		MongoDatabase mdb = client.getDatabase(Collection); 
		MongoCollection<Document> collection = mdb.getCollection("googgleAPI");
		Document doc = new Document(); 
		doc.append("Zipcode", zipcode).append("Address", formatted_address).append("Date", new Date()); 
		try {
		collection.insertOne(doc);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		collection.drop();
		}
		System.out.println("ID "+doc.get("_id"));
		System.out.println("Added to DB :) ");

	}

	public static void processResponseObj(MapsResponseObj results, int zipcode) {
		for(GoogleAPIResults gps:results.getResults()) {
    		System.out.println(gps.getFormatted_address());
    	 addDatatoDB(zipcode, gps.getFormatted_address());
    	}
		
	}

	

}

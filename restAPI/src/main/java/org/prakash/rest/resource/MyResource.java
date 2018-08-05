package org.prakash.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.prakash.rest.restAPI.Objects.GoogleAPIResults;
import org.prakash.rest.restAPI.Objects.MapsResponseObj;
import org.prakash.rest.services.GoogleMapsServices;
import org.prakash.rest.util.URLBuilder;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
   public MapsResponseObj getIt() {
    	Client client = ClientBuilder.newClient();
    	Response response = client.target(URLBuilder.buildURLForZip(78230)).request().get();
    
    	if(response.getStatus() == 200) {
    		System.out.println(" Success ");
    	}else {
    		System.out.println(" Failed to get data "+ response.getStatus());
    	}
    	
    	MapsResponseObj results = response.readEntity(MapsResponseObj.class);
  
    	for(GoogleAPIResults gps:results.getResults()) {
    		System.out.println(gps.getFormatted_address());
    	}
    	
    	
        return results;
    }
    /**
     * 
     * @param mapResObj
     * @return
     */
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String setIt(MapsResponseObj mapResObj) {
    	GoogleMapsServices gms = new GoogleMapsServices(); 
    	gms.addDatatoDB(mapResObj); 
    	
        return "Got it " ;
        
    }
}

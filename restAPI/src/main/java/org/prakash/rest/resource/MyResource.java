package org.prakash.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.prakash.rest.restAPI.Objects.GoogleAPIResults;
import org.prakash.rest.restAPI.Objects.InstaResponse;
import org.prakash.rest.restAPI.Objects.MapsResponseObj;
import org.prakash.rest.util.URLBuilder;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyResource {

    /**
     * dynamic zip code/
     * @param zipcode
     * @return
     */
//    @GET
//    @Path("/{zipcode}")
//   public MapsResponseObj getIt(@PathParam("zipcode") int zipcode) {
//    	Client client = ClientBuilder.newClient();
//    	Response response = client.target(URLBuilder.buildURLForZip((zipcode))).request().get();
//    
//    	if(response.getStatus() == 200) {
//    		System.out.println(" Success ");
//    	}else {
//    		System.out.println(" Failed to get data "+ response.getStatus());
//    	}
//    	
//    	MapsResponseObj results = response.readEntity(MapsResponseObj.class);
//  
//    	for(GoogleAPIResults gps:results.getResults()) {
//    		System.out.println(gps.getFormatted_address());
//    	}
//    	
//    	
//        return results;
//    }
    /**
     * static zip code 
     * @return
     */
//    @GET
//    public MapsResponseObj getLocationResults() {
//    	Client client = ClientBuilder.newClient();
//    	Response response = client.target(URLBuilder.buildURLForZip(78230)).request().get();
//    
//    	if(response.getStatus() == 200) {
//    		System.out.println(" Success ");
//    	}else {
//    		System.out.println(" Failed to get data "+ response.getStatus());
//    	}
//    	
//    	MapsResponseObj results = response.readEntity(MapsResponseObj.class);
//  
//    	for(GoogleAPIResults gps:results.getResults()) {
//    		System.out.println(gps.getFormatted_address());
//    	}
//    	
//    	
//        return results;
//    }
    
    
    @GET 
    public InstaResponse getInstaResponse(@QueryParam("access_token") String access_token) {
    	
    	System.out.println(access_token);
    	Client client = ClientBuilder.newClient();
    	Response response = client.target(URLBuilder.buildURLForInsta(access_token)).request().get();
    
    
    	
    	InstaResponse results = response.readEntity(InstaResponse.class);
    	
    	return results;
    	
    	//return response.readEntity(String.class);
    }
    
}

/**
 * 
 */
package com.appy.GoogleMaps.Services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prakashsrirangaswamy
 *
 */
@RestController
public class GoogleMapsResources {
	
	
	@GetMapping("/ZipCode")
	public String returnGoogleData() {
		
		Client client = ClientBuilder.newClient();
    	Response response = client.target("https://maps.googleapis.com/maps/api/geocode/json?address=78230").request().get();
    	if(response.getStatus() == 200) {
    		System.out.println(" Success ");
    	}else {
    		System.out.println(" Failed to get data "+ response.getStatus());
    	}
    
        return response.toString();
		
	}

}

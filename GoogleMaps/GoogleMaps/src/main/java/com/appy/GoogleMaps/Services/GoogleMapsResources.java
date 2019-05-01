/**
 * 
 */
package com.appy.GoogleMaps.Services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prakashsrirangaswamy
 * made changes on 05/01
 *
 */
@RestController
public class GoogleMapsResources {
	
	
	//@GetMapping("/ZipCode")
	@RequestMapping("/ZipCode")
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

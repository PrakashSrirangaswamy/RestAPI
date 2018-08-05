package org.prakash.rest.util;

public class URLBuilder {

	public URLBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static String buildURLForZip(int zipcode) {
		return "https://maps.googleapis.com/maps/api/geocode/json?address="+zipcode;
		
	}

}

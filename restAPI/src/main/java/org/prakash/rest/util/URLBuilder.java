package org.prakash.rest.util;

public class URLBuilder {

	public URLBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static String buildURLForZip(int zipcode) {
		
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address="+zipcode; 
		System.out.println(url);
		return url;
		
	}

	public static String buildURLForInsta(String access_token) {
		// TODO Auto-generated method stub
		return "https://api.instagram.com/v1/users/self/?access_token="+access_token;
	}

}

package org.prakash.rest.restAPI.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoogleAPIResults {

	String formatted_address;
	String place_id;
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	
	public String toString() { 
		System.out.println("inside to string ");
		return formatted_address + place_id; 
		
	}
	
	
}

package org.prakash.rest.restAPI.Objects;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MapsResponseObj {
	
	String status; 
	GoogleAPIResults [] results;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GoogleAPIResults[] getResults() {
		return results;
	}
	public void setResults(GoogleAPIResults[] results) {
		this.results = results;
	}
	
	

}

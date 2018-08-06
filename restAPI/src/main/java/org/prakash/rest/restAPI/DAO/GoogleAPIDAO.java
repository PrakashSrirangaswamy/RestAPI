package org.prakash.rest.restAPI.DAO;

import java.util.Calendar;
import java.util.List;
/**
 * 
 * @author prakashsrirangaswamy
 *
 */
public class GoogleAPIDAO {
	int id;
	String place_id;
	int zipCode;
	String location;
	Calendar timestamp; 
	String latitude;
	String longitude;
	List<CountyDetailsDAO> countyDetails; 
	
	public List<CountyDetailsDAO> getCountyDetails() {
		return countyDetails;
	}
	public void setCountyDetails(List<CountyDetailsDAO> countyDetails) {
		this.countyDetails = countyDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Calendar getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	} 
	
}

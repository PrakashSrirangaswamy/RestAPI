package com.appy.GoogleMaps.DAO;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@XmlRootElement
public class Client {

	@Id
	private long id; 
	
	private String fName; 
	private String lName; 
	private String city; 
	private String State;
	@Transient
	private int zipCode;
	
	private Client() {
		
	}
	
	public Client(long id, String fName, String lName, String city, String state, int zipCode) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		State = state;
		this.zipCode = zipCode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", State=" + State
				+ ", zipCode=" + zipCode + "]";
	} 
	
	
}

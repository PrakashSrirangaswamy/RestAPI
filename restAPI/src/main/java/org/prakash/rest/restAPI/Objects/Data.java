package org.prakash.rest.restAPI.Objects;

public class Data {
	
	String id; 
	String username; 
	String full_name; 
	String bio; 
	String website; 
	boolean is_business; 
	InstaCounts[] counts;
	
	

	
	public Data(String id, String username, String full_name, String bio, String website, boolean is_business,
			InstaCounts[] counts) {
		super();
		this.id = id;
		this.username = username;
		this.full_name = full_name;
		this.bio = bio;
		this.website = website;
		this.is_business = is_business;
		this.counts = counts;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean isIs_business() {
		return is_business;
	}
	public void setIs_business(boolean is_business) {
		this.is_business = is_business;
	}
	public InstaCounts[] getCounts() {
		return counts;
	}
	public void setCounts(InstaCounts[] counts) {
		this.counts = counts;
	} 
	
	
	

}

package in.com.rays.encapsulation;

import java.util.Date;

public class person {
	
	private String name;
	private Date dob;
	private String address;
	private String gender;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
		
	public void setDob(Date dob) {
		this.dob=dob;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getGender() {
		return gender;
	}

}

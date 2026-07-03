package inheritanceHW;

import java.util.Date;

public class Person {
	
	protected String name;
	protected String address;
	protected Date dob;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address ) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setDob(Date dob) {
		this.dob=dob;
	}
	
	public Date getDob() {
		return dob;
	}
	

}

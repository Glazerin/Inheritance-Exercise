package model;

public class Persona {

	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddress;
	
	public Persona(String name, String address, String phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Class name : " + this.getClass().getSimpleName() + "\nName : " + this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}

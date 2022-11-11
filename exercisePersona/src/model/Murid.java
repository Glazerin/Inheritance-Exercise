package model;

public class Murid extends Persona{

	private final String status;

	public Murid(String name, String address, String phoneNumber, String emailAddress, String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	

}

package model;

import java.time.LocalDate;

public class Staff extends Pegawai{
	
	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, Double salary,
			LocalDate recDate) {
		super(name, address, phoneNumber, emailAddress, office, salary, recDate);
	}
	
}

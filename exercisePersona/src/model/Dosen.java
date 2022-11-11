package model;

import java.time.LocalDate;

public class Dosen extends Pegawai{
	
	private Double officeHours;
	private String academicPos;
	
	public Dosen(String name, String address, String phoneNumber, String emailAddress, String office, Double salary,
			LocalDate recDate, Double officeHours, String academicPos) {
		super(name, address, phoneNumber, emailAddress, office, salary, recDate);
		this.officeHours = officeHours;
		this.academicPos = academicPos;
	}
	

	public Double getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(Double officeHours) {
		this.officeHours = officeHours;
	}

	public String getAcademicPos() {
		return academicPos;
	}

	public void setAcademicPos(String academicPos) {
		this.academicPos = academicPos;
	}
	
	

	

}

package model;

import java.time.LocalDate;

public class Pegawai extends Persona{
	
	protected String office;
	protected Double salary;
	protected LocalDate recDate;
	
	public Pegawai(String name, String address, String phoneNumber, String emailAddress, String office, Double salary,
			LocalDate recDate) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.recDate = recDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getRecDate() {
		return recDate;
	}

	public void setRecDate(LocalDate recDate) {
		this.recDate = recDate;
	}
	
	
}

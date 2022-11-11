package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.Dosen;
import model.Murid;
import model.Staff;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Murid> student = new ArrayList<Murid>();
	ArrayList<Dosen> teacher = new ArrayList<Dosen>();
	ArrayList<Staff> staff = new ArrayList<Staff>();

	public int scanInt() {
		int n=0;
		try {
			n = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			scan.nextLine();
		}
		return n;
	}

	public void cls() {
		for(int i=0; i<50; i++) {
			System.out.println("");
		}
	}

	public void buffer() {
		System.out.print("Press Enter to continue...");
		scan.nextLine();
	}

	public Main() {
		int menu = 0;
		while (menu !=4) {
			System.out.println("========MENU========");
			System.out.println("1. Input data");
			System.out.println("2. View data");
			System.out.println("3. View Class - Name");
			System.out.println("4. Exit");
			System.out.println("====================");
			System.out.print("Choose >> ");
			menu = scanInt();
			cls();

			switch (menu) {
			case 1:
				int submenu1 =0;
				while (submenu1 != 4) {
					System.out.println("=====INPUT DATA=====");
					System.out.println("1. Input data murid");
					System.out.println("2. Input data Dosen");
					System.out.println("3. Input data staff");
					System.out.println("4. Back");
					System.out.println("====================");
					System.out.print("Choose >> ");
					submenu1 = scanInt();
					cls();

					switch (submenu1) {
					case 1:
						submenu11();
						break;

					case 2:
						submenu12();
						break;

					case 3:
						submenu13();
						break;
					}
				}
				break;

			case 2:
				int submenu2 =0;
				while (submenu2 != 4) {
					System.out.println("=====VIEW DATA=====");
					System.out.println("1. View data murid");
					System.out.println("2. View data Dosen");
					System.out.println("3. View data staff");
					System.out.println("4. Back");
					System.out.println("====================");
					System.out.print("Choose >> ");
					submenu2 = scanInt();
					cls();

					switch (submenu2) {
					case 1:
						submenu21();
						break;

					case 2:
						submenu22();
						break;

					case 3:
						submenu23();
						break;
					}
				}
				break;
			
			case 3:
				System.out.println("=====DATA MURID=====");
				for(int i=0; i<student.size(); i++) {
					Murid s = student.get(i);
					System.out.printf("%d. %s\n", i+1, s.toString());
				}
				System.out.println("");
				
				System.out.println("=====DATA DOSEN=====");
				for(int i=0; i<teacher.size(); i++) {
					Dosen d = teacher.get(i);
					System.out.printf("%d. %s\n", i+1, d.toString());
				}
				System.out.println("");
				
				System.out.println("=====DATA STAFF=====");
				for(int i=0; i<staff.size(); i++) {
					Staff s = staff.get(i);
					System.out.printf("%d. %s\n", i+1, s.toString());
				}
				System.out.println("");
				buffer();
				cls();
				break;
			}
		}
	}

	public void submenu11() {
		String name = "";
		int len = 0;
		while (len < 1 || len > 30) {
			System.out.print("Input nama murid [1 - 30 huruf] : ");
			name = scan.nextLine();
			len = name.length();
		}
		String address = "";
		while (!address.startsWith("Jalan")) {
			System.out.print("Input alamat murid [dimulai dengan kata Jalan] : ");
			address = scan.nextLine();
		}
		String phoneNum = "";
		boolean check = true;
		len = 0;
		while ((len < 10 || len > 12) || check == false) {
			System.out.print("Input nomor telepon murid [10 - 12 angka] : ");
			phoneNum = scan.nextLine();
			len = phoneNum.length();
			if (len >= 10 && len <= 12) {
				for(int i=0; i<len; i++) {
					if(!Character.isDigit(phoneNum.charAt(i))) check = false;
				}
			}
		}
		String email = "";
		len = 0;
		while (len < 11 || !email.endsWith("@gmail.com")) {
			System.out.print("Input email murid [@gmail.com] : ");
			email = scan.nextLine();
			len = email.length();
		}
		String status = "";
		while (!status.equals("Freshmen") || !status.equals("Sophomore") || !status.equals("Junior") || !status.equals("Senior")) {
			System.out.print("Input status murid [Freshmen | Sophomore | Junior | Senior] : ");
			status = scan.nextLine();
		}

		student.add(new Murid(name, address, phoneNum, email, status));
		ending();
		buffer();
		cls();
	}

	public void submenu12() {
		String name = "";
		int len = 0;
		while (len < 1 || len > 30) {
			System.out.print("Input nama dosen [1 - 30 huruf] : ");
			name = scan.nextLine();
			len = name.length();
		}
		String address = "";
		while (!address.startsWith("Jalan")) {
			System.out.print("Input alamat dosen [dimulai dengan kata Jalan] : ");
			address = scan.nextLine();
		}
		String phoneNum = "";
		boolean check = true;
		len = 0;
		while ((len < 10 || len > 12) || check == false) {
			System.out.print("Input nomor telepon dosen [10 - 12 angka] : ");
			phoneNum = scan.nextLine();
			len = phoneNum.length();
			if (len >= 10 && len <= 12) {
				for(int i=0; i<len; i++) {
					if(!Character.isDigit(phoneNum.charAt(i))) check = false;
				}
			}
		}
		String email = "";
		len = 0;
		while (len < 11 || !email.endsWith("@gmail.com")) {
			System.out.print("Input email dosen [@gmail.com] : ");
			email = scan.nextLine();
			len = email.length();
		}
		String office = "";
		while (!office.equals("Kemanggisan") || !office.equals("Alam Sutera") || !office.equals("Bekasi")) {
			System.out.print("Input lokasi kantor dosen [Kemanggisan | Alam Sutera | Bekasi] : ");
			office = scan.nextLine();
		}
		Double salary = 0.0 ;
		while (salary < 3000.0 || salary > 20000.0) {
			System.out.print("Input gaji dosen [3000.0 - 20000.0] : ");
			salary = scan.nextDouble();
		}
		LocalDate recDate = null;
		int date=0;
		int month=0;
		int year =0;
		while (date < 0 || date > 31) {
			System.out.print("Input tanggal rekrut [1 - 31] : ");
			date = scanInt();
		}
		while (month < 0 || month > 12) {
			System.out.print("Input bulan rekrut [1 -12] : ");
			month = scanInt();
		}
		while (year < 1900 || year > 2022) {
			System.out.print("Input tahun rekrut [1900 - 2022] : ");
			year = scanInt();
		}
		recDate = LocalDate.of(year, month, date);
		Double hour = 0.0;
		while (hour < 30.0) {
			System.out.print("Input jam kerja dosen [30.0 - 50.0] : ");
			hour = scan.nextDouble();
		}
		String pos = "";
		len = 0;
		while (len < 1) {
			System.out.print("Input posisi akademik dosen : ");
			pos = scan.nextLine();
		}

		teacher.add(new Dosen(name, address, phoneNum, email, office, salary, recDate, hour, pos));
		ending();
		buffer();
		cls();
	}

	public void submenu13() {
		String name = "";
		int len = 0;
		while (len < 1 || len > 30) {
			System.out.print("Input nama staff [1 - 30 huruf] : ");
			name = scan.nextLine();
			len = name.length();
		}
		String address = "";
		while (!address.startsWith("Jalan")) {
			System.out.print("Input alamat staff [dimulai dengan kata Jalan] : ");
			address = scan.nextLine();
		}
		String phoneNum = "";
		boolean check = true;
		len = 0;
		while ((len < 10 || len > 12) || check == false) {
			System.out.print("Input nomor telepon staff [10 - 12 angka] : ");
			phoneNum = scan.nextLine();
			len = phoneNum.length();
			if (len >= 10 && len <= 12) {
				for(int i=0; i<len; i++) {
					if(!Character.isDigit(phoneNum.charAt(i))) check = false;
				}
			}
		}
		String email = "";
		len = 0;
		while (len < 11 || !email.endsWith("@gmail.com")) {
			System.out.print("Input email staff [@gmail.com] : ");
			email = scan.nextLine();
			len = email.length();
		}
		String office = "";
		while (!office.equals("Kemanggisan") || !office.equals("Alam Sutera") || !office.equals("Bekasi")) {
			System.out.print("Input lokasi kantor staff [Kemanggisan | Alam Sutera | Bekasi] : ");
			office = scan.nextLine();
		}
		Double salary = 0.0 ;
		while (salary < 3000.0 || salary > 20000.0) {
			System.out.print("Input gaji staff [3000.0 - 20000.0] : ");
			salary = scan.nextDouble();
		}
		LocalDate recDate = null;
		int date=0;
		int month=0;
		int year =0;
		while (date < 0 || date > 31) {
			System.out.print("Input tanggal rekrut [1 - 31] : ");
			date = scanInt();
		}
		while (month < 0 || month > 12) {
			System.out.print("Input bulan rekrut [1 -12] : ");
			month = scanInt();
		}
		while (year < 1900 || year > 2022) {
			System.out.print("Input tahun rekrut [1900 - 2022] : ");
			year = scanInt();
		}
		recDate = LocalDate.of(year, month, date);
		staff.add(new Staff(name, address, phoneNum, email, office, salary, recDate));
		ending();
		buffer();
		cls();
	}

	public void ending() {
		System.out.println("");
		System.out.println("Semua data telah tercatat, terima kasih!");
	}

	public void submenu21() {
		System.out.println("+====+================================+================================+==============+======================+===========+");
		System.out.println("| No | Nama                           | Alamat                         | No. Telp     | Email                | Status    |");
		System.out.println("+====+================================+================================+==============+======================+===========+");
		for(int i=0; i<student.size(); i++) {
			Murid s = student.get(i);
			System.out.printf("+ %-2d | %-30s | %-30s | %-12s | %-20s | %-9s |\n", i+1, s.getName(), s.getAddress(), s.getPhoneNumber(), s.getEmailAddress(), s.getStatus());
		}
		System.out.println("+====+================================+================================+==============+======================+===========+");
		buffer();
		cls();
	}

	public void submenu22() {
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+===========+=================+");
		System.out.println("| No | Nama                           | Alamat                         | No. Telp     | Email                | Kantor      | Gaji   | Tanggal Rekrut | Jam Kerja | Posisi Akademik |");
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+===========+=================+");
		for(int i=0; i<teacher.size(); i++) {
			Dosen d = teacher.get(i);
			System.out.printf("+ %-2d | %-30s | %-30s | %-12s | %-20s | %-11s | %-6f | %-14s | %-9f | %-15s |\n", i+1, d.getName(), d.getAddress(), d.getEmailAddress(), d.getOffice(), d.getSalary(), d.getRecDate().toString(), d.getOfficeHours(), d.getAcademicPos());
		}
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+===========+=================+");
		buffer();
		cls();
	}

	public void submenu23() {
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+");
		System.out.println("| No | Nama                           | Alamat                         | No. Telp     | Email                | Kantor      | Gaji   | Tanggal Rekrut |");
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+");
		for(int i=0; i<staff.size(); i++) {
			Staff s = staff.get(i);
			System.out.printf("+ %-2d | %-30s | %-30s | %-12s | %-20s | %-11s | %-6f | %-14s |\n", i+1, s.getName(), s.getAddress(), s.getPhoneNumber(), s.getEmailAddress(), s.getOffice(), s.getSalary(), s.getRecDate().toString());
		}
		System.out.println("+====+================================+================================+==============+======================+=============+========+================+");
		buffer();
		cls();
	}

	public static void main(String[] args) {
		new Main();

	}

}

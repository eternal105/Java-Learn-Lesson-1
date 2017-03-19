package model;

import java.time.LocalDate;

public class Client extends Person {
 
	private String id;
	private String mobile;
	private String email;
	private LocalDate birthDate;
	
	public Client(String id, String firstName, String lastName, String mobile, String email, LocalDate birthDate){
		super(firstName, lastName);
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobileNumber) {
		this.mobile = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nID: " + this.getId());
		sb.append("\nFirst name: " + this.getFirstName());
		sb.append("\nLast name: " + this.getLastName());
		sb.append("\nMobile number: " + this.getMobile());
		sb.append("\nEmail: " + this.getEmail());
		sb.append("\nBirth day: " + this.getBirthDate());
		return sb.toString();
	}
}

package model;

import java.time.LocalDate;

public class Client {
 
	private String id;
	private String firstName;  
	private String lastName;
	private String mobile;
	private String email;
	private LocalDate birthDate;
	
	public Client(String id, String firstName, String lastName, String mobile, String email, LocalDate birthDate){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String secondName) {
		this.lastName = secondName;
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

package model;

public class Employee extends Person {
	
	private String username;
	private String password;
	
	public Employee(String username, String firstName, String lastName, String password) {
		super(firstName, lastName);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nFirst name: " + this.getFirstName());
		sb.append("\nLast name: " + this.getLastName());
		sb.append("\nusername: " + this.getUsername());
		sb.append("\nPassword: " + "*******");
		return sb.toString();
	}
}

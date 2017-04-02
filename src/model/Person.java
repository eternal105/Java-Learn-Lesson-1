package model;

public abstract class Person {
	
	private String firstName;
	private String LastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
}

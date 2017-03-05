package model;

import java.time.LocalDateTime;

public class Comunication {

	private Client client;
	private Employee employee;
	private String type;
	private String content;
	private LocalDateTime time;
	
	public Comunication(Client client, Employee employee, String type, String content, LocalDateTime time) {
		this.client = client;
		this.employee = employee;
		this.type = type;
		this.content = content;
		this.time = time;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
}

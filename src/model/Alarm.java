package model;

import java.time.LocalDateTime;

public class Alarm {
	
	private Client client;
	private String description;
	private LocalDateTime time;
	private Boolean isActive;
	
	public Alarm(Client client, String description, LocalDateTime time, Boolean isActive) {
		this.client = client;
		this.description = description;
		this.time = time;
		this.isActive = isActive;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

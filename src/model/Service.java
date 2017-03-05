package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Service {

	private Client client;
	private String type;
	private String description;
	private LocalDate date;
	private BigDecimal price;
	private Boolean isFinished;
	private Boolean isPaid;
	
	public Service(Client client, String type, String description, LocalDate date, BigDecimal price) 
	{
		this.client = client;
		this.type = type;
		this.description = description;
		this.date = date;
		this.price = price;
		this.isFinished = false;
		this.isPaid = false;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
}

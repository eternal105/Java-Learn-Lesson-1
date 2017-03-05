package model;

public class Company {

	private String id;
	private String name;
	private Client[] clients;
	private Employee[] employees;
	private Comunication[] comunications;
	private Service[] services;
	private Alarm[] alarms;
	
	public Company(String id, String name) {
		this.id = id;
		this.name = name;
		this.clients = new Client[0];
		this.employees = new Employee[0];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client[] getClients() {
		return clients;
	}

	public void setClients(Client[] clients) {
		this.clients = clients;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Comunication[] getComunications() {
		return comunications;
	}

	public void setComunications(Comunication[] comunications) {
		this.comunications = comunications;
	}

	public Service[] getServices() {
		return services;
	}

	public void setServices(Service[] services) {
		this.services = services;
	}

	public Alarm[] getAlarms() {
		return alarms;
	}

	public void setAlarms(Alarm[] alarms) {
		this.alarms = alarms;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nCompany " + this.getName());
		sb.append("\nID: " + this.getId());
		sb.append("\n\nEmployees: ");
		for(int i = 0; i < this.getEmployees().length; i++){
			sb.append(this.getEmployees()[i].toString());
		}
		sb.append("\n\nClients: ");
		for(int i = 0; i < this.getClients().length; i++){
			sb.append(this.getClients()[i].toString());
		}
		
		return sb.toString();
	}
}

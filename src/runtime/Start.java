package runtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.Client;
import model.Company;
import model.Employee;

public class Start {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		
		System.out.println("How many employees you want to insert:");
		int numberOfEmployees = s.nextInt(); s.nextLine();
		
		Employee[] employees = new Employee[numberOfEmployees];
		for(int i = 0; i < numberOfEmployees; i++){
			System.out.println("\nInsert data about " + (i + 1) + ". employee");
			employees[i] = createEmployee();
		}
		
		System.out.println("How many clients you want to insert:");
		int numberOfClients = s.nextInt(); s.nextLine();
		
		Client[] clients = new Client[numberOfClients];
		for(int i = 0; i < numberOfClients; i++){
			System.out.println("\nInsert data about " + (i + 1) + ". client");
			clients[i] = createClient();
		}
		
		System.out.println("\nInsert data about company");
		Company c = createCompany();
		c.setClients(clients);
		c.setEmployees(employees);
		
		System.out.println(c);
		
	}

	private static Client createClient(){
		System.out.println("Insert id:");
		String id = s.nextLine();
		System.out.println("Insert last name:");
		String lastName = s.nextLine();
		System.out.println("Insert first name:");
		String firstName = s.nextLine();
		System.out.println("Insert phone number:");
		String mobile = s.nextLine();
		System.out.println("Insert email address:");
		String email = s.nextLine();
		System.out.println("Insert birth date (dd.MM.yyyy.):");
		String date = s.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		LocalDate birthDate = LocalDate.parse(date, formatter);
		
		Client c = new Client(id, firstName, lastName, mobile, email, birthDate);
		return c;
	}
	
	private static Employee createEmployee(){
		System.out.println("Insert username:");
		String username = s.nextLine();
		System.out.println("Insert last name:");
		String lastName = s.nextLine();
		System.out.println("Insert first name:");
		String firstName = s.nextLine();
		System.out.println("Insert password:");
		String pwd = s.nextLine();
		
		Employee e = new Employee(username, firstName, lastName, pwd);
		return e;
	}
	
	private static Company createCompany(){
		System.out.println("Insert id:");
		String id = s.nextLine();
		System.out.println("Insert name:");
		String name = s.nextLine();
		
		Company c = new Company(id, name);
		return c;
	}
}

package runtime;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Alarm;
import model.Article;
import model.Client;
import model.Employee;
import model.Person;
import model.SellingService;
import model.SmallCellingCompany;

public class Start {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isCorrect;
		int numberOfEmployees = 0;
		do {
			try {
				System.out.println("How many employees you want to insert:");
				numberOfEmployees = s.nextInt(); s.nextLine();
				isCorrect = true;
			} catch (InputMismatchException e) {
				isCorrect = false;
				System.out.println("Inserted data type is incorect. Please try again.");
			}
		} while (!isCorrect);

		Employee[] employees = new Employee[numberOfEmployees];
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.println("\nInsert data about " + (i + 1) + ". employee");
			employees[i] = createEmployee();
		}

		int numberOfClients = 0;
		do {
			try {
				System.out.println("How many clients you want to insert:");
				numberOfClients = s.nextInt(); s.nextLine();
				isCorrect = true;
			} catch (InputMismatchException e) {
				isCorrect = false;
				System.out.println("Inserted data type is incorect. Please try again.");
			}
		} while (!isCorrect);

		Client[] clients = new Client[numberOfClients];
		for (int i = 0; i < numberOfClients; i++) {
			System.out.println("\nInsert data about " + (i + 1) + ". client");
			clients[i] = createClient();
		}

		Person persons[] = new Person[numberOfEmployees + numberOfClients];
		for (int i = 0; i < numberOfEmployees; i++) {
			persons[i] = employees[i];
		}
		for (int i = 0; i < numberOfClients; i++) {
			persons[i + numberOfEmployees] = clients[i];
		}

		Arrays.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		for (Person p : persons) {
			if (p instanceof Employee) {
				Employee e = (Employee) p;
				System.out.println(e);
			} else if (p instanceof Client) {
				Client c = (Client) p;
				System.out.println(c);
			}
		}

		System.out.println("\nInsert data about company");
		SmallCellingCompany c = createSmallCellingCompany();
		c.setEmployees(employees);
		c.setClients(clients);

		System.out.println("How many services you want to complete:");
		int numberOfServices = s.nextInt();
		s.nextLine();

		double total = 0.0;

		for (int i = 0; i < numberOfServices; i++) {

			int selected = 0;
			do {
				System.out.println("Choose number in front of client:");
				for (int j = 0; j < c.getClients().length; j++) {
					System.out.println(
							j + 1 + ") " + c.getClients()[j].getFirstName() + " " + c.getClients()[j].getLastName());
				}
				selected = s.nextInt();
				s.nextLine();
				if (selected < 1 || selected > c.getClients().length) {
					System.out.println("Your number is not in range.");
				}
			} while (selected < 1 || selected > c.getClients().length);
			Client selectedClient = c.getClients()[--selected];

			System.out.println("Insert type of service:");
			String typeOfService = s.nextLine();

			System.out.println("Insert description of service:");
			String descriptionOfService = s.nextLine();

			System.out.println("Insert price of service:");
			BigDecimal priceOfService = s.nextBigDecimal();
			s.nextLine();

			do {
				System.out.println("Choose number in front of article:");
				for (int j = 0; j < c.getArticles().length; j++) {
					System.out.println(j + 1 + ") " + c.getArticles()[j].getName());
				}
				selected = s.nextInt();
				s.nextLine();
				if (selected < 1 || selected > c.getArticles().length) {
					System.out.println("Your number is not in range.");
				}
			} while (selected < 1 || selected > c.getArticles().length);
			Article selectedArticle = c.getArticles()[--selected];

			SellingService ss = new SellingService(selectedClient, typeOfService, descriptionOfService, priceOfService,
					selectedArticle);

			System.out.println("Insert number of articles you want to buy:");
			int numberOfArticles = s.nextInt();
			s.nextLine();

			total += ss.selling(numberOfArticles).doubleValue();
			
			String alarmDescription = "Feedback for service: " + ss.getDescription();
			LocalDateTime alarmTime = LocalDateTime.now().plusMinutes(1);
			Alarm a = new Alarm(ss.getClient(), alarmDescription, alarmTime);
			c.getAlarms().add(a);
		}
		System.out.println("Total price: " + total + "$");
	}

	private static SmallCellingCompany createSmallCellingCompany() {
		System.out.println("Insert id:");
		String id = s.nextLine();
		System.out.println("Insert name:");
		String name = s.nextLine();

		System.out.println("How many articles you want to insert:");
		int numberOfArticles = s.nextInt();
		s.nextLine();

		Article[] articles = new Article[numberOfArticles];

		for (int i = 0; i < numberOfArticles; i++) {
			articles[i] = createArticle();
		}

		SmallCellingCompany c = new SmallCellingCompany(id, name, articles);
		return c;
	}

	private static Article createArticle() {
		System.out.println("Insert name:");
		String name = s.nextLine();
		System.out.println("Insert category:");
		String category = s.nextLine();

		Article a = new Article(name, category);
		return a;
	}

	private static Client createClient() {
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

		LocalDate birthDate = null;
		boolean isCorrect;
		do {
			try {
				System.out.println("Insert birth date (dd.MM.yyyy.):");
				String date = s.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				birthDate = LocalDate.parse(date, formatter);
				isCorrect = true;
			} catch (DateTimeParseException e) {
				isCorrect = false;
				System.out.println("Inserted date format is incorect. Please try again.");
			}
		} while (!isCorrect);

		Client c = new Client(id, firstName, lastName, mobile, email, birthDate);
		return c;
	}

	private static Employee createEmployee() {
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
}

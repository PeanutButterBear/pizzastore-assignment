package edu.cscc;
//calvin gates, 10/10/2022, java database access lab 6
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	// Database credentials
	static final String USER = "";
	static final String PASS = "";
	static final String PORT = "";
	static final String HOST = "";
	static final String DATABASE = "PizzaStore";

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
	static String datestr = LocalDateTime.now().format(formatter);
	static final PizzaOrder[] orders = {
			new PizzaOrder(1, datestr, PizzaSize.MEDIUM, PizzaType.REGULAR, PizzaTopping.CHEESE),
			new PizzaOrder(1, datestr, PizzaSize.LARGE, PizzaType.DEEPDISH, PizzaTopping.PEPPERONI),
			new PizzaOrder(1, datestr, PizzaSize.SMALL, PizzaType.NOCRUST, PizzaTopping.VEGGIE),
			new PizzaOrder(1, datestr, PizzaSize.MEDIUM, PizzaType.THIN, PizzaTopping.PEPPERONI),
			new PizzaOrder(5, datestr, PizzaSize.LARGE, PizzaType.REGULAR, PizzaTopping.CARNIVORE),
			new PizzaOrder(1, datestr, PizzaSize.MEDIUM, PizzaType.NOCRUST, PizzaTopping.VEGGIE), };

	public static void main(String[] args) throws SQLException {
		PizzaStore store = new PizzaStore(USER, PASS, PORT, HOST, DATABASE);
		if (!store.createOrdersTable()) {
			System.out.println("Cannot create orders table");
			System.exit(-1);
		}

		for (PizzaOrder order : orders) {
			if (!store.placeOrder(order)) {
				System.out.println("Cannot create order");
			}
		}
		System.out.println("Done");
	}
}

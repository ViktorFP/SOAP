package by.epamlab;

import java.net.URL;
import java.util.List;

import by.epamlab.beans.reservations.customer.Customer;

public class WebServiceClient {
	public static void main(String[] args) {
		URL url = new URL("http://localhost:8080/CustomerService?wsdl");
		CustomerService customerService = new CustomerService(url);
		List<Customer> customers = customerService.getCustomers();
		for (Customer c : customers) {
			System.out.println("Custmer: " + c.getFirstName() + " " + c.getLastName() + "\nEmail: "
					+ c.getEmail().getEmailAddress() + "\nPhone: " + c.getPhone().getPhoneNumber() + "\n");
		}
	}
}

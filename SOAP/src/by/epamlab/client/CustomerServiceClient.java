package by.epamlab.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import by.epamlab.CustomerServiceI;
import by.epamlab.beans.reservations.customer.Customer;
import by.epamlab.beans.reservations.customer.Phone;

public class CustomerServiceClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/customer?wsdl");
		QName qname = new QName("http://epamlab.by/", "CustomerServiceImplService");
		Service service = Service.create(url, qname);
		CustomerServiceI customerService = service.getPort(CustomerServiceI.class);
		// get list customers
		System.out.println("Customers number: " + customerService.getCustomers().size());
		// get customer by ID
		String id = "RESV_RETRIEVE_Customer1850432";
		Customer customer = customerService.getCustomerById(id);
		System.out.println("Customer with ID " + id + ": " + customer.getFirstName() + " " + customer.getLastName());
		// add customer
		customer = new Customer();
		customer.setFirstName("Petya");
		customer.setLastName("Kolin");
		customer = customerService.addCustomer(customer);
		System.out.println("Added customer: " + customer.getFirstName() + " " + customer.getLastName());
		customer.setPhone(new Phone(){
			private static final long serialVersionUID = 1L;
			{this.setPhoneNumber("123-45-21");}
		});
		customer = customerService.updateCustomer(customer);
		System.out.println("Added customer after update: " + customer.getFirstName() + " " + customer.getLastName()
				+ " (phone: " + customer.getPhone().getPhoneNumber() + ")");
		if (customerService.deleteCustomer(customer.getCustomerDocID())) {
			System.out.println("Last customer deleted.");
		}
	}
}

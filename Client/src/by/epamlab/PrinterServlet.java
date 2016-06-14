package by.epamlab;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import by.epamlab.beans.reservations.customer.Customer;
import by.epamlab.beans.reservations.customer.Phone;

public class PrinterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		printer(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		printer(request, response);
	}

	private void printer(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			// --
			URL url = new URL("http://localhost:9999/ws/customer?wsdl");
			QName qname = new QName("http://epamlab.by/", "CustomerServiceImplService");
			Service service = Service.create(url, qname);
			CustomerServiceI customerService = service.getPort(CustomerServiceI.class);
			// get list customers
			out.println("Customers number: " + customerService.getCustomers().size()+ "<BR>");
			// get customer by ID
			String id = "RESV_RETRIEVE_Customer1850432";
			Customer customer = customerService.getCustomerById(id);
			out.println("Customer with ID " + id + ": " + customer.getFirstName() + " " + customer.getLastName() + "<BR>");
			// add customer
			customer = new Customer();
			customer.setFirstName("Petya");
			customer.setLastName("Kolin");
			customer = customerService.addCustomer(customer);
			out.println("Added customer: " + customer.getFirstName() + " " + customer.getLastName() + "<BR>");
			// update customer
			Phone phone = new Phone();
			phone.setPhoneNumber("123-45-21");
			customer.setPhone(phone);
			customer = customerService.updateCustomer(customer);
			out.println("Added customer after update: " + customer.getFirstName() + " " + customer.getLastName()
					+ " (phone: " + customer.getPhone().getPhoneNumber() + ")" + "<BR>");
			if (customerService.deleteCustomer(customer.getCustomerDocID())) {
				out.println("Last customer deleted.");
			}
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}

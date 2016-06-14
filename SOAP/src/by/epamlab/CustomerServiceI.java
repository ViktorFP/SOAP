package by.epamlab;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import by.epamlab.beans.reservations.customer.Customer;

@WebService
public interface CustomerServiceI {
	@WebMethod List<Customer> getCustomers();
	@WebMethod Customer getCustomerById(String id);
	@WebMethod Customer addCustomer(Customer customer);
	@WebMethod Customer updateCustomer(Customer customer);
	@WebMethod boolean deleteCustomer(String id);
}

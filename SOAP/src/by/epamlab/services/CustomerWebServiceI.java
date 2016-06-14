package by.epamlab.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import by.epamlab.beans.reservations.customer.Customer;

@WebService
public interface CustomerWebServiceI {
	@WebMethod List<Customer> getCustomers();
	@WebMethod Customer getCustomerById(@WebParam(name = "id") String id);
	@WebMethod Customer addCustomer(@WebParam(name = "customer") Customer customer);
	@WebMethod Customer updateCustomer(@WebParam(name = "customer") Customer customer);
	@WebMethod boolean deleteCustomer(@WebParam(name = "id") String id);
}

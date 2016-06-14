package by.epamlab.services;

import java.io.IOException;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.xml.sax.SAXException;

import by.epamlab.beans.ifaces.IRepositoryDAO;
import by.epamlab.beans.reservations.customer.Customer;
import by.epamlab.factories.RepositoryFactory;

@WebService(endpointInterface  = "by.epamlab.services.CustomerWebServiceI")
public class CustomerWebServiceImpl implements CustomerWebServiceI{
	private static IRepositoryDAO repositoryDAO = RepositoryFactory.getRepository();

	@Override
	public List<Customer> getCustomers() {
		try {
			return repositoryDAO.getCustomers();
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Customer getCustomerById(@WebParam(name = "id") String id) {
		try {
			return repositoryDAO.getCustomer(id);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Customer addCustomer(@WebParam(name = "customer") Customer customer) {
		try {
			return repositoryDAO.addCustomer(customer);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Customer updateCustomer(@WebParam(name = "customer") Customer customer) {
		try {
			return repositoryDAO.updateCustomer(customer);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteCustomer(@WebParam(name = "id") String id) {
		return repositoryDAO.deleteCustomer(id);
	}
}

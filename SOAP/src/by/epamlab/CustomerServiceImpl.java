package by.epamlab;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;

import org.xml.sax.SAXException;

import by.epamlab.beans.ifaces.IRepositoryDAO;
import by.epamlab.beans.reservations.customer.Customer;
import by.epamlab.factories.RepositoryFactory;

@WebService(endpointInterface = "by.epamlab.CustomerServiceI")
public class CustomerServiceImpl implements CustomerServiceI{
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
	public Customer getCustomerById(String id) {
		try {
			return repositoryDAO.getCustomer(id);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Customer addCustomer(Customer customer) {
		try {
			return repositoryDAO.addCustomer(customer);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		try {
			return repositoryDAO.updateCustomer(customer);
		} catch (IOException | SAXException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteCustomer(String id) {
		return repositoryDAO.deleteCustomer(id);
	}

}

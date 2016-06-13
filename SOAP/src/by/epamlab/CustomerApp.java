package by.epamlab;

import javax.xml.ws.Endpoint;

import by.epamlab.services.CustomerWebService;

public class CustomerApp {
    public static void main(String[] args) {
        //http://localhost:8080/CustomerService?wsdl
    	String url = "http://0.0.0.0:8080/CustomerService";
        Endpoint.publish(url, new CustomerWebService());
    }
}

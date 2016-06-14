package by.epamlab;

import javax.xml.ws.Endpoint;

import by.epamlab.services.CustomerWebServiceImpl;

public class CustomerApp {
    public static void main(String[] args) {
       String url = "http://localhost:9999/services/customer";
        Endpoint.publish(url, new CustomerWebServiceImpl());
    }
}

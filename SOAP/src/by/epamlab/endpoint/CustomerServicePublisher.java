package by.epamlab.endpoint;

import javax.xml.ws.Endpoint;

import by.epamlab.CustomerServiceImpl;

public class CustomerServicePublisher {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/customer", new CustomerServiceImpl());
	    }
}

package com.example.payroll;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException {

	  OrderNotFoundException(Long id) {
	    super("Could not find order " + id);
	  }
}

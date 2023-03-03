package com.example.payroll;

//Custom exception for when employee is looked up but not found
@SuppressWarnings("serial")
class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
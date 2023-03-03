package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

//Interface allowing data management
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}


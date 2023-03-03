package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

//functions much like the other repository and allows database interaction
interface OrderRepository extends JpaRepository<Order, Long> {
}
package com.github.teocci.javajpaspring.repositories;

import com.github.teocci.javajpaspring.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
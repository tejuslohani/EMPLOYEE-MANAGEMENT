package com.smart.EMPLOYEE_MANAGEMENT.repository;


import com.smart.EMPLOYEE_MANAGEMENT.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

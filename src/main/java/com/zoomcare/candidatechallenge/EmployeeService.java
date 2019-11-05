
package com.zoomcare.candidatechallenge;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
	List<Employee> employees = new ArrayList<Employee>();
	employeeRepository.findAll().forEach(employee -> employees.add(employee));
	return employees;
    }

    public Employee getEmployeeById(int id) {
	return employeeRepository.findById(id).get();
    }

}

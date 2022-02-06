package com.concretepage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.concretepage.domain.Employee;

@Service
public class EmployeeService {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Victor", "Fernandez"));
		list.add(new Employee(2, "Borja", "Colas"));
		list.add(new Employee(3, "Alberto", "Hernandez"));
		return list;
	}
}

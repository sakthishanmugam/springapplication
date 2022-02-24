package com.springboot.springbootrestexample;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;  
@Service
public class EmployeeService implements IEmployeeService  {

	@Override  
	public List<Employee> findAll()  
	{  
	//creating an object of ArrayList  
	ArrayList<Employee> employees = new ArrayList<Employee>();
	employees.add(new Employee("Sujith", "Kumar", "sujith@gmail.com")); 
	employees.add(new Employee("kumar", "k", "kumar@gmail.com"));
	
	
	return employees; 
}
	
	
}
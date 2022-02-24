package com.springboot.springbootrestexample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired  
	private IEmployeeService employeeService;  
	
	@GetMapping(value = "/employee")  
	public List<Employee> getEmployee()   
	{  
	//finds all the products  
	List<Employee> employees = employeeService.findAll();  
	//returns the product list 
	
	return employees;  
	}  

}

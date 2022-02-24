package com.springboot.springbootrestexample;

public class Employee {
	
	private String firstname;  
	private String lastname;  
	private String emailid; 
	
	public Employee() {
		
	}

	public Employee(String firstname, String lastname, String emailid)   
	{  
	super();  
	this.firstname = firstname;  
	this.lastname = lastname;  
	this.emailid = emailid;
	} 
	public String getfirstname()   
	{  
	return firstname;  
	}  
	public void setfirstname(String firstname)   
	{  
	this.firstname = firstname;  
	}  
	public String getlastname()   
	{  
	return lastname;  
	}  
	public void setlastname(String lastname)   
	{  
	this.lastname = lastname;  
	}  
	public String getemailid()   
	{  
	return emailid;  
	}  
	public void setemailid(String emailid)   
	{  
	this.emailid = emailid;  
	}  
}

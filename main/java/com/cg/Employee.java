package com.cg;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${emp.id}")
	private int employeeId;
	
	@Value("${emp.name}")
	private String employeeName;
	
	@Value("${emp.salary}")
	private double salary;
	
	@Value("${emp.age}")
	private int age;
	
	 @Autowired
	private SBUBeans businessUnit;
	
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String employeeName, double salary, int age) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SBUBeans getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBUBeans businessUnit) {
		this.businessUnit = businessUnit;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
	

}
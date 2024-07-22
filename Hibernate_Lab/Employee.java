package com.hibertut;

import javax.persistence.*;

// Mark this class as an entity to be mapped to a database table
@Entity
// Specify the table name in the database
@Table(name = "Employee_Details")
public class Employee {
	
	// Mark this field as the primary key
	@Id
	private int empNo;
	private String empName;
	private String empAddress;
	private String empDesignation;
	private String emp_Salary;
	private char emp_Grade;
	private String emp_Department;

	/**
	 * Parameterized constructor to initialize all fields
	 * @param empNo Employee number (primary key)
	 * @param empName Employee name
	 * @param empAddress Employee address
	 * @param empDesignation Employee designation
	 * @param emp_Salary Employee salary
	 * @param emp_Grade Employee grade
	 * @param emp_Department Employee department
	 */
	public Employee(int empNo, String empName, String empAddress, String empDesignation, String emp_Salary,
			char emp_Grade, String emp_Department) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empDesignation = empDesignation;
		this.emp_Salary = emp_Salary;
		this.emp_Grade = emp_Grade;
		this.emp_Department = emp_Department;
	}

	/**
	 * Default constructor
	 */
	public Employee() {
		super();
	}

	// Getter and Setter for empNo
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	// Getter and Setter for empName
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	// Getter and Setter for empAddress
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	// Getter and Setter for empDesignation
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	// Getter and Setter for emp_Salary
	public String getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(String emp_Salary) {
		this.emp_Salary = emp_Salary;
	}

	// Getter and Setter for emp_Grade
	public char getEmp_Grade() {
		return emp_Grade;
	}
	public void setEmp_Grade(char emp_Grade) {
		this.emp_Grade = emp_Grade;
	}

	// Getter and Setter for emp_Department
	public String getEmp_Department() {
		return emp_Department;
	}
	public void setEmp_Department(String emp_Department) {
		this.emp_Department = emp_Department;
	}

	// Override the toString method to return a string representation of the Employee object
	@Override
	public String toString() {
		return this.empNo + " : " + this.empName + " : " + this.empDesignation + " : " + this.empAddress + " : " + this.emp_Salary + " : " + this.emp_Grade + " : " + this.emp_Department;
	}
}

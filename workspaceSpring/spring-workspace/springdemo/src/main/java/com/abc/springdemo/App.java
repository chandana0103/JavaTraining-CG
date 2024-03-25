package com.abc.springdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee emp1 = new Employee();
       emp1.setEmpno(10);
       emp1.setName("raj");
       
       
       
       //-----------------
       
       Employee emp2 = new Employee(20,"sdf");
       
       
       
    	
    }
}

class Employee {
	
	int empno;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
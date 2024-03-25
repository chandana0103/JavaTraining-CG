public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee emp1 = null;
		try {
			emp1 = new Employee("Pritam", 2000);
			System.out.println(emp1);
		} catch (EmployeeException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
	}
}

class Employee {
	private String name;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(String name, int salary) throws EmployeeException {
		super();
		this.name = name;
		if (salary < 3000) {
			throw new EmployeeException("Salary less than 3000 can't be added!");
		} else {
			this.salary = salary;
		}
		System.out.println("Employee added!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Salary=" + salary;
	}
}

class EmployeeException extends Exception {
	public EmployeeException(String msg) {
		super(msg);
	}
}
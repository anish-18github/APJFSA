package Lab5;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee employee = new Employee("John", "Doe", 50000);
	        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", Salary: $" + employee.getSalary());

	        // Demonstrate multilevel inheritance
	        Manager manager = new Manager("Jane", "Smith", 75000, "IT Manager");
	        System.out.println("Manager: " + manager.getFirstName() + " " + manager.getLastName() + ", Salary: $" + manager.getSalary() + ", Post: " + manager.getPost());

	        // Demonstrate hierarchical inheritance
	        Citizen citizen = new Citizen("Alice", "Johnson", "USA");
	        System.out.println("Citizen: " + citizen.getFirstName() + " " + citizen.getLastName() + ", Citizenship: " + citizen.getCitizenship());
	}

}

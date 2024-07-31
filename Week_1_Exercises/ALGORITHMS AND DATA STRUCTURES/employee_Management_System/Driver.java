package employee_Management_System;

public class Driver {
	public static void main(String[] args) {
	 EmployeeManager manager = new EmployeeManager(2); // Initial capacity of 2

     // Add employees
     manager.addEmployee(new Employee(1, "John Doe", "Software Engineer", 75000.00));
     manager.addEmployee(new Employee(2, "Jane Smith", "Senior Software Engineer", 90000.00));
     manager.addEmployee(new Employee(3, "Bob Johnson", "Project Manager", 105000.00)); // Triggers array resize

     // Display all employees
     System.out.println("All Employees:");
     manager.displayEmployees();

     // Search for an employee
     Employee searchedEmployee = manager.searchEmployeeById(2);
     System.out.println("\nSearched Employee:");
     if (searchedEmployee != null) {
         System.out.println(searchedEmployee);
     } else {
         System.out.println("Employee not found.");
     }

     // Delete an employee
     boolean isDeleted = manager.deleteEmployeeById(2);
     System.out.println("\nDelete Status: " + (isDeleted ? "Employee deleted successfully." : "Employee not found."));

     // Display all employees after deletion
     System.out.println("\nEmployees after deletion:");
     manager.displayEmployees();
	}
}

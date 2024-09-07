package EMS.Employee.services;

import java.util.List;

import EMS.Employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(long id);

	Employee getEmployeeById(long id);

	Employee updateEmployee(long id, Employee employee);

}

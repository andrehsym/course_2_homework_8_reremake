package pro.sky.java.homeworks.course2.homework_8_reremake.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.homeworks.course2.homework_8_reremake.data.Employee;
import pro.sky.java.homeworks.course2.homework_8_reremake.exceptions.EmployeeAlreadyExistsException;
import pro.sky.java.homeworks.course2.homework_8_reremake.exceptions.EmployeeNotFoundException;
import pro.sky.java.homeworks.course2.homework_8_reremake.service.EmployeeService;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Set<Employee> employees = new HashSet<>();

    @Override
    public Employee add(String fullName, int department, int salary) {
        Employee newbie = new Employee(fullName, department, salary);
        if (employees.contains(fullName) && employees.contains(department) && employees.contains(salary)) {
            throw new EmployeeAlreadyExistsException();
        }
        employees.add(newbie);
        return newbie;
    }

    @Override
    public Employee remove(String fullName, int department, int salary) {
        Employee removed = new Employee(fullName, department, salary);
        if (employees.contains(removed)) {
            employees.remove(removed);
            return removed;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String fullName, int department, int salary) {
        Employee find = new Employee(fullName, department, salary);
        if (employees.contains(find)) {
            return find;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Set<Employee> printEmployeeList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return employees;
    }

    public Set<Employee> getEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return employees;
    }
}

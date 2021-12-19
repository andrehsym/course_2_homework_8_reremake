package pro.sky.java.homeworks.course2.homework_8_reremake.service;

import pro.sky.java.homeworks.course2.homework_8_reremake.data.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee getEmployeeMinSalary(int department);

    Employee getEmployeeMaxSalary(int department);

    Collection<Employee> getEmployeeFor(int department);

    Map<Integer, List<Employee>> getSortedEmployeesByDepartment();
}

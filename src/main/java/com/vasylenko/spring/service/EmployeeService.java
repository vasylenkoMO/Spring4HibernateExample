package com.vasylenko.spring.service;

import com.vasylenko.spring.model.Employee;

import java.util.List;

/**
 * Created by vastl271nko on 09.10.16.
 */
public interface EmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);

}

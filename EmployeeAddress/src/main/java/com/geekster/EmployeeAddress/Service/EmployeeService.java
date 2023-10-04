package com.geekster.EmployeeAddress.Service;

import com.geekster.EmployeeAddress.Model.Employee;
import com.geekster.EmployeeAddress.Repo.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployee iEmployee;

    public String CreateEmployees(Employee employees) {
        iEmployee.save(employees);
        return "Add Emp";
    }

    public List<Employee> getAllEmployees() {
        return iEmployee.findAll();
    }

    public Employee getEmployeeIdBy(Employee id) {
        return iEmployee.findById(id);
    }

    public void updateEmp(long id, Employee employee) {
        boolean emp1 = iEmployee.existsById(id);
        if(emp1){
            iEmployee.save(employee);
        }
    }

    public String deleteEmp(Long id) {
        iEmployee.deleteById(id);
        return "delete Employee";
    }
}

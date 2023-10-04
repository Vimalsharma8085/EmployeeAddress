package com.geekster.EmployeeAddress.Controller;

import com.geekster.EmployeeAddress.Model.Employee;
import com.geekster.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("employee")
    public String CreateEmployees(@RequestBody Employee employees){
        return employeeService.CreateEmployees(employees);
    }

    @GetMapping("Employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("Employee/{id}")
    public Employee getEmployeeIdBy(@PathVariable Employee id){
        return employeeService.getEmployeeIdBy(id);
    }



    @PutMapping("employee/update/{id}")
    public void updateEmp(@PathVariable Long id, @RequestBody Employee employee){
        employeeService.updateEmp(id, employee);
    }

    @DeleteMapping("employee/delete/{id}")
    public String deleteEmp(@PathVariable Long id){
        return employeeService.deleteEmp(id);
    }
}

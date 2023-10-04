package com.geekster.EmployeeAddress.Repo;

import com.geekster.EmployeeAddress.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployee  extends JpaRepository<Employee,Long> {
    Employee findById(Employee id);
}

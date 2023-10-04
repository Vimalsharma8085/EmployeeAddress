package com.geekster.EmployeeAddress.Repo;


import com.geekster.EmployeeAddress.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address,Long> {
}

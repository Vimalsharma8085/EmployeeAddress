package com.geekster.EmployeeAddress.Controller;

import com.geekster.EmployeeAddress.Model.Address;
import com.geekster.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("CreateAdd")
    public String createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }
    @GetMapping("getAllAdd")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("getAddById/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PutMapping("updateAdd/id/{id}")
    public Address updateAddress(@PathVariable Long id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @DeleteMapping("deleteAdd/id/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
    }
}

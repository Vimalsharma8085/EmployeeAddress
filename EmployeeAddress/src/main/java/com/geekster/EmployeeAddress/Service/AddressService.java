package com.geekster.EmployeeAddress.Service;

import com.geekster.EmployeeAddress.Model.Address;
import com.geekster.EmployeeAddress.Repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddress iAddress;

    public List<Address> getAllAddresses() {
        return iAddress.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return iAddress.findById(id);
    }

    public String createAddress(Address address) {

        iAddress.save(address);
        return "add address";
    }

    public Address updateAddress(Long id, Address address) {
        boolean add1 = iAddress.existsById(id);
        if(add1){
            iAddress.save(address);
        }
        return address;
    }

    public void deleteAddress(Long id) {
        iAddress.findById(id);
    }
}

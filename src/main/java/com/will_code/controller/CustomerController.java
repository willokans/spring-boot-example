package com.will_code.controller;

import com.will_code.entity.Customer;
import com.will_code.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping
    public List<Customer> getCustomers(){
        return  customerRepository.findAll();
    }

    record NewCustomerRequest(
            String name,
            String email,
            Integer age
    ){}

    @PostMapping()
    public void addCustomer(@RequestBody NewCustomerRequest request){
        Customer customer = new Customer();
        customer.setName(request.name);
        customer.setEmail(request.email);
        customer.setAge(request.age);
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer Id){
        customerRepository.deleteById(Id);
        return "Deleted Successfully!";
    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer Id,
                               @RequestBody NewCustomerRequest request){

        Customer customer = new Customer();
        Customer existingCust = customerRepository.findById(customer.getId()).orElse(null);
        existingCust.setName(customer.getName());
        existingCust.setAge(customer.getAge());
        existingCust.setEmail(customer.getEmail());
        customerRepository.save(existingCust);
    }
}

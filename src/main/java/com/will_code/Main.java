package com.will_code;

import com.will_code.entity.Customer;
import com.will_code.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

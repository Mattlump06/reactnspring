package com.nerdsthink.reactjs.bootstrap;

import com.nerdsthink.reactjs.domain.Employee;
import com.nerdsthink.reactjs.respositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Matthew", "Lumpkin", "CEO"));
    }
}

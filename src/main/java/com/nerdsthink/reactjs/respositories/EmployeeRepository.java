package com.nerdsthink.reactjs.respositories;

import com.nerdsthink.reactjs.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

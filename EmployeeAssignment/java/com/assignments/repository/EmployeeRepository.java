package com.assignments.repository;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.assignments.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
     
}

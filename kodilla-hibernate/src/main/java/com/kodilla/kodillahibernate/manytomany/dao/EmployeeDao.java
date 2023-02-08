package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeesWithAGivenLastname(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> retrieveEmployeesWithAGivenPartOfLastname(@Param("ARG") String partOfTheLastname);
}
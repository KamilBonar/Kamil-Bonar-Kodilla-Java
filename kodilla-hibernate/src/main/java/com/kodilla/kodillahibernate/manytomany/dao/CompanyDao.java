package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesByFragmentOfTheName(@Param("FRAGMENT_OF_THE_NAME") String fragmentOfTheName);

    @Query
    List<Company> retrieveCompaniesByAnyFragmentOfTheName(@Param("ARG") String arg);

}
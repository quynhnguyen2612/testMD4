package com.codegym.testmd4.repository;

import com.codegym.testmd4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}

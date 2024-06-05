package com.codegym.testmd4.repository;


import com.codegym.testmd4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String name);

    List<City> findByNameContaining(String name);

    List<City> findByCountry_Id(Long id);
    @Query(value = "select * from student where id = :id", nativeQuery = true)
    City findByIdCustom(@Param("id") Long id);

}


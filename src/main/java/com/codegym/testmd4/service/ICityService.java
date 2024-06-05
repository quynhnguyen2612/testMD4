package com.codegym.testmd4.service;

import com.codegym.testmd4.model.City;

import java.util.List;

public interface ICityService extends IGenerateService<City> {

    List<City> findByNameContaining(String name);

    City findByIdCustom(Long id);

}

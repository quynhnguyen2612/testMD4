package com.codegym.testmd4.service.impl;


import com.codegym.testmd4.model.City;
import com.codegym.testmd4.repository.CityRepository;
import com.codegym.testmd4.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        Optional<City> studentOptional = cityRepository.findById(id);
        return studentOptional.get();
    }

    @Override
    public void save(City student) {
        cityRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }

    }

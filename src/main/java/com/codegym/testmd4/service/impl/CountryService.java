package com.codegym.testmd4.service.impl;


import com.codegym.testmd4.model.Country;
import com.codegym.testmd4.repository.CountryRepository;
import com.codegym.testmd4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return null;
    }

    @Override
    public void save(Country country) {

    }

    @Override
    public void remove(Long id) {

    }
}

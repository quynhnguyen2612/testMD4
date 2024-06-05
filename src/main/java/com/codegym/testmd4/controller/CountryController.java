package com.codegym.testmd4.controller;
import com.codegym.testmd4.model.Country;
import com.codegym.testmd4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
@CrossOrigin("*")

public class CountryController {

    @Autowired
    private ICountryService countryService;
    @GetMapping("")
    public ResponseEntity<List<Country>> getAll() {
        List<Country> list = countryService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> add(@RequestBody Country country) {
        countryService.save(country);
        String message = "Add success";
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody Country country) {
        country.setId(id);
        countryService.save(country);
        String message = "Edit success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        countryService.remove(id);
        String message = "Deleted success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}


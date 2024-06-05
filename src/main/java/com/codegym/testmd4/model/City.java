package com.codegym.testmd4.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double acreage;
    private Long population;
    private String introduce;
    private double GDP;
    @ManyToOne
    private Country country;
}

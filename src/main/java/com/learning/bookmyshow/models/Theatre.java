package com.learning.bookmyshow.models;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Theatre extends BaseModel {
    private String name;

    @OneToMany
    private List<Screen> screens;

    @ManyToOne
    private City city;
}

package com.example.johnmsaylor.hibernatedemo.service;

import com.example.johnmsaylor.hibernatedemo.model.Fruit;
import com.example.johnmsaylor.hibernatedemo.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitService {

    @Autowired
    FruitRepository database;

    public Fruit save(Fruit fruit) {
        return database.save(fruit);
    }

}

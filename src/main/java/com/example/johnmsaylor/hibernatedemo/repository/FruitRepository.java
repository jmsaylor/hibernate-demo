package com.example.johnmsaylor.hibernatedemo.repository;

import com.example.johnmsaylor.hibernatedemo.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, String> {
}

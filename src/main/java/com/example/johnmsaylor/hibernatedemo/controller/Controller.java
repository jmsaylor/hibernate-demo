package com.example.johnmsaylor.hibernatedemo.controller;

import com.example.johnmsaylor.hibernatedemo.model.Fruit;
import com.example.johnmsaylor.hibernatedemo.model.Payload;
import com.example.johnmsaylor.hibernatedemo.service.FruitService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    FruitService fruitService;

    @Autowired
    Gson gson;

    @PostMapping("/")
    public ResponseEntity<String> addFruit(@RequestBody Payload payload){
        String response = "";
        switch (payload.getAction())
        {
            case "ADD_FRUIT":
                System.out.println("hit");
                System.out.println();
                Fruit fruit = gson.fromJson(payload.getData().toString(), Fruit.class);
                fruitService.save(fruit);
                response = "Added " + fruit.getName();
                break;
            default:
        }

        return ResponseEntity.ok(response);
    }
}

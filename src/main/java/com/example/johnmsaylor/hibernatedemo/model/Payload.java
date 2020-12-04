package com.example.johnmsaylor.hibernatedemo.model;

import com.fasterxml.jackson.databind.JsonNode;

public class Payload {

    private String action;
    private JsonNode data;

    public Payload(){};

    public Payload(String action, JsonNode data) {
        this.action = action;
        this.data = data;
    }


    public String getAction() {
        return action;
    }

    public JsonNode getData() {
        return data;
    }
}

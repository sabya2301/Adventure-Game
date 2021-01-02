package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int location;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int location, String description) {
        this.location = location;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }


}























package com.endava.grocy.model;

public enum EntityType {

    PRODUCT("products"),
    CHORES("chores"),
    LOCATION("locations"),
    QUANTITY_UNIT("quantity_units");

    private String name;

    private EntityType(String name){
        this.name = name;
    }

}

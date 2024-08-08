package com.RBACSYSTEM.RBAC.entity;

public class Test {
    int id;
    String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "test : id = " + this.id + " | nom = " + this.name;
    }
}

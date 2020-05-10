package test;

import java.util.*;

public class Customer{
    int id;
    String name;
    float salary;

    protected int age = 23;

    protected Customer() {
    }

    public Customer(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


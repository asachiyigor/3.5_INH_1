package ru.netology.domain;

public class Smartphone extends Product {
    private String company;

    public Smartphone(int id, String name, int price, String company) {
        super(id, name, price);
        this.company = company;
    }
}

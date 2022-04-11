package ru.netology.domain;

public class Smartphone extends Product {
    private String company;

    public Smartphone(int id, String name, int price, String company) {
        super(id, name, price);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return getCompany().contains(search);
    }
}

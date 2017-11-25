package com.dzieniszewski.listazakupw;

public class Product {
    private String name;
    private String price;
    private int ammount;

    public Product(String name, String price, int ammount) {
        this.name = name;
        this.price = price;
        this.ammount = ammount;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

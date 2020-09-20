package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String producer;
    private String photo;

    public Product() {
    }

    public Product(int id, String name, String price, String producer, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}

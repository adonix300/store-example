package org.example.entities;

public class Product extends LongIdEntity{
    private String name;
    private int price;
    private String manufacturer;

    //private int rating;

    public Product(String name, int price, String manufacturer, long id) {
        super(id);
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }
}

package org.example.entities;

public class User extends LongIdEntity{
    // TODO name, addmoney, usemoney
    private int money;

    private String name;

    public User(int money, String name, long id) {
        super(id);
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

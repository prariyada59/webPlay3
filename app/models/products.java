package models;

import scala.util.parsing.combinator.testing.Str;


public class  products{

    private String id, name,col;
    private int capacity;
    private double price;
    private double amount;

    public products(String id,String name,String col,int capacity,double price, double amount){

        this.id = id;
        this.name = name;
        this.col = col;
        this.capacity = capacity;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public class Register {
        private String surname, birthday, gender, phone, email, address;

        public Register() {
        }

    }
}




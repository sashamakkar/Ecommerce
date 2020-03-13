package com.example.hp.ecommerce.Model;

public class Users {

    private String name, number, password, image, address;

    public Users(){
        this.name=" ";
        this.number=" ";
        this.password=" ";
        this.image=" ";
        this.address=" ";
    }

    public Users(String name, String number, String password) {
        this.name = name;
        this.number = number;
        this.password = password;
        this.image="abc";
        this.address="def";
    }

    public Users(String name, String phone, String password, String image, String address) {
        this.name = name;
        this.number = phone;
        this.password = password;
        this.image = image;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String email) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

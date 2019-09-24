package com.example.recycleview;

public class Person {

    private String name;
    private String Address;
    private String contactNumber;

    public Person(String name, String address, String contactNumber) {
        this.name = name;
       this. Address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

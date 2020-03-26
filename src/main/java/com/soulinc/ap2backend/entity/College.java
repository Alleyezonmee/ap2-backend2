package com.soulinc.ap2backend.entity;

public class College {
    private String college_id;
    private String college_name;
    private Address address;

    public String getCollege_id() {
        return college_id;
    }

    public void setCollege_id(String college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id='" + college_id + '\'' +
                ", college_name='" + college_name + '\'' +
                ", address=" + address +
                '}';
    }
}

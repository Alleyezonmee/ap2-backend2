package com.soulinc.ap2backend.model;

public class AddressDTO {
    private String college_id;
    private String line_one;
    private String line_two;
    private String city_name;
    private String state_name;
    private String pin_code;

    public String getCollege_id() {
        return college_id;
    }

    public void setCollege_id(String college_id) {
        this.college_id = college_id;
    }

    public String getLine_one() {
        return line_one;
    }

    public void setLine_one(String line_one) {
        this.line_one = line_one;
    }

    public String getLine_two() {
        return line_two;
    }

    public void setLine_two(String line_two) {
        this.line_two = line_two;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getPin_code() {
        return pin_code;
    }

    public void setPin_code(String pin_code) {
        this.pin_code = pin_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "college_id='" + college_id + '\'' +
                ", line_one='" + line_one + '\'' +
                ", line_two='" + line_two + '\'' +
                ", city_name='" + city_name + '\'' +
                ", state_name='" + state_name + '\'' +
                ", pin_code='" + pin_code + '\'' +
                '}';
    }
}
